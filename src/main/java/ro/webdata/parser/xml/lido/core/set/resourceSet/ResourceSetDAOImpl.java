package ro.webdata.parser.xml.lido.core.set.resourceSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.resourceSetComplexType.ResourceSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.resourceSetComplexType.ResourceSetComplexTypeDAOImpl;

import java.util.Map;

public class ResourceSetDAOImpl implements ResourceSetDAO {
    private static ResourceSetComplexTypeDAO resourceSetComplexTypeDAO = new ResourceSetComplexTypeDAOImpl();

    public ResourceSet getResourceSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new ResourceSet(
                resourceSetComplexTypeDAO.getResourceSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
