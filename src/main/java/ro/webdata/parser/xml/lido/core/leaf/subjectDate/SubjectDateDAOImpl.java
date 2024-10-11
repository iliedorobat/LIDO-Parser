package ro.webdata.parser.xml.lido.core.leaf.subjectDate;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectDateDAOImpl implements SubjectDateDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public SubjectDate getSubjectDate(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new SubjectDate(
                dateSetComplexTypeDAO.getDateSetComplexTypeParser(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
