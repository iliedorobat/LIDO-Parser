package ro.webdata.parser.xml.lido.core.set.resourceSet;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.resourceSetComplexType.ResourceSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.resourceSetComplexType.ResourceSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ResourceSetDAOImpl implements ResourceSetDAO {
    private static ResourceSetComplexTypeDAO resourceSetComplexTypeDAO = new ResourceSetComplexTypeDAOImpl();

    public ResourceSet getResourceSet(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new ResourceSet(
                resourceSetComplexTypeDAO.getResourceSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
