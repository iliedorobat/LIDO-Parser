package ro.webdata.parser.xml.lido.core.wrap.subjectWrap;

import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSetDAO;
import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class SubjectWrapDAOImpl implements SubjectWrapDAO {
    private static SubjectSetDAO subjectSetParser = new SubjectSetDAOImpl();

    public SubjectWrap getSubjectWrap(Node node) {
        ArrayList<SubjectSet> subjectSetList = new ArrayList<SubjectSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:subjectSet")) {
                subjectSetList.add(subjectSetParser.getSubjectSet(child));
            }
        }

        return new SubjectWrap(subjectSetList);
    }
}
