package ro.webdata.parser.xml.lido.core.leaf.subject;

import ro.webdata.parser.xml.lido.core.complex.subjectComplexType.SubjectComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.subjectComplexType.SubjectComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class SubjectDAOImpl implements SubjectDAO {
    private static SubjectComplexTypeDAO subjectComplexTypeDAO = new SubjectComplexTypeDAOImpl();

    public Subject getSubject(Node node) {
        return new Subject(subjectComplexTypeDAO.getSubjectComplexType(node));
    }
}
