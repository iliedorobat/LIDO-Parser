package ro.webdata.parser.xml.lido.core.leaf.resourceSource;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;

import java.util.Map;

public class ResourceSourceDAOImpl implements ResourceSourceDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public ResourceSource getResourceSource(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new ResourceSource(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
