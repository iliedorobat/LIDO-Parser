package ro.webdata.parser.xml.lido.core.wrap.subjectWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSet;
import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSetDAO;
import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSetDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class SubjectWrapDAOImpl implements SubjectWrapDAO {
    private static SubjectSetDAO subjectSetParser = new SubjectSetDAOImpl();

    public SubjectWrap getSubjectWrap(Node node) {
        List<SubjectSet> subjectSetList = new ArrayList<SubjectSet>();
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
