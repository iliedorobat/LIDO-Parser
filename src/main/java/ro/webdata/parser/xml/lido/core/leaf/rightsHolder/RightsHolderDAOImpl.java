package ro.webdata.parser.xml.lido.core.leaf.rightsHolder;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;

import java.util.Map;

public class RightsHolderDAOImpl implements RightsHolderDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RightsHolder getRightsHolder(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new RightsHolder(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
