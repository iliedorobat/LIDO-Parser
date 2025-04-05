package ro.webdata.parser.xml.lido.core.leaf.subjectDate;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;

import java.util.Map;

public class SubjectDateDAOImpl implements SubjectDateDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public SubjectDate getSubjectDate(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new SubjectDate(
                dateSetComplexTypeDAO.getDateSetComplexTypeParser(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
