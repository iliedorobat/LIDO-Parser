package ro.webdata.parser.xml.lido.core.set.subjectSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.subjectSetComplexType.SubjectSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.subjectSetComplexType.SubjectSetComplexTypeDAOImpl;

import java.util.Map;

public class SubjectSetDAOImpl implements SubjectSetDAO {
    private static SubjectSetComplexTypeDAO subjectSetComplexTypeDAO = new SubjectSetComplexTypeDAOImpl();

    public SubjectSet getSubjectSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new SubjectSet(
                subjectSetComplexTypeDAO.getSubjectSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
