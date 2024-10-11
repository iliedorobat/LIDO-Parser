package ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap.RelatedWorksWrap;
import ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap.RelatedWorksWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap.RelatedWorksWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.subjectWrap.SubjectWrap;
import ro.webdata.parser.xml.lido.core.wrap.subjectWrap.SubjectWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.subjectWrap.SubjectWrapDAOImpl;

public class ObjectRelationWrapDAOImpl implements ObjectRelationWrapDAO {
    private static SubjectWrapDAO subjectWrapDAO = new SubjectWrapDAOImpl();
    private static RelatedWorksWrapDAO relatedWorksWrapDAO = new RelatedWorksWrapDAOImpl();

    public ObjectRelationWrap getObjectRelationWrap(Node node) {
        SubjectWrap subjectWrap = null;
        RelatedWorksWrap relatedWorksWrap = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:subjectWrap":
                    subjectWrap = subjectWrapDAO.getSubjectWrap(child);
                    break;
                case "lido:relatedWorksWrap":
                    relatedWorksWrap = relatedWorksWrapDAO.getRelatedWorksWrap(child);
                    break;
                default: break;
            }
        }

        return new ObjectRelationWrap(subjectWrap, relatedWorksWrap);
    }
}
