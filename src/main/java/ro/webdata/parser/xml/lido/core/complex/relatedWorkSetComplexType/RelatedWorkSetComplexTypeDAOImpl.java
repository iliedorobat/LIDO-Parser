package ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.relatedWork.RelatedWorkDAO;
import ro.webdata.parser.xml.lido.core.leaf.relatedWorkRelType.RelatedWorkRelTypeDAO;
import ro.webdata.parser.xml.lido.core.leaf.relatedWork.RelatedWorkDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.relatedWorkRelType.RelatedWorkRelTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.relatedWork.RelatedWork;
import ro.webdata.parser.xml.lido.core.leaf.relatedWorkRelType.RelatedWorkRelType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RelatedWorkSetComplexTypeDAOImpl implements RelatedWorkSetComplexTypeDAO {
    private static RelatedWorkDAO relatedWorkParser = new RelatedWorkDAOImpl();
    private static RelatedWorkRelTypeDAO relatedWorkRelTypeParser = new RelatedWorkRelTypeDAOImpl();

    public RelatedWorkSetComplexType getRelatedWorkSetComplexType(Node node) {
        RelatedWork relatedWork = null;
        RelatedWorkRelType relatedWorkRelType = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:relatedWork":
                    relatedWork = relatedWorkParser.getRelatedWork(child);
                    break;
                case "lido:date":
                    relatedWorkRelType = relatedWorkRelTypeParser.getRelatedWorkRelType(child);
                    break;
                default: break;
            }
        }

        return new RelatedWorkSetComplexType(relatedWork, relatedWorkRelType);
    }
}
