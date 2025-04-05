package ro.webdata.parser.xml.lido.core.leaf.subjectObject;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAOImpl;

import java.util.Map;

public class SubjectObjectDAOImpl implements SubjectObjectDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();

    public SubjectObject getSubjectObject(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new SubjectObject(
                objectSetComplexTypeDAO.getObjectSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
