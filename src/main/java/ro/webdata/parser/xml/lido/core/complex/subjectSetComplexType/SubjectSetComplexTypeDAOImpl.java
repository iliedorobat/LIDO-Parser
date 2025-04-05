package ro.webdata.parser.xml.lido.core.complex.subjectSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.displaySubject.DisplaySubject;
import ro.webdata.parser.xml.lido.core.leaf.displaySubject.DisplaySubjectDAO;
import ro.webdata.parser.xml.lido.core.leaf.displaySubject.DisplaySubjectDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subject.Subject;
import ro.webdata.parser.xml.lido.core.leaf.subject.SubjectDAO;
import ro.webdata.parser.xml.lido.core.leaf.subject.SubjectDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class SubjectSetComplexTypeDAOImpl implements SubjectSetComplexTypeDAO {
    private static DisplaySubjectDAO displaySubjectParser = new DisplaySubjectDAOImpl();
    private static SubjectDAO subjectDAOParser = new SubjectDAOImpl();

    public SubjectSetComplexType getSubjectSetComplexType(Node node) {
        List<DisplaySubject> displaySubjectList = new ArrayList<DisplaySubject>();
        Subject subject = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displaySubject":
                    displaySubjectList.add(displaySubjectParser.getDisplaySubject(child));
                    break;
                case "lido:subject":
                    subject = subjectDAOParser.getSubject(child);
                    break;
                default: break;
            }
        }

        return new SubjectSetComplexType(displaySubjectList, subject);
    }
}
