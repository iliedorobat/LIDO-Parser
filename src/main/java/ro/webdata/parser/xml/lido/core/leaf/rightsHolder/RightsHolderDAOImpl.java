package ro.webdata.parser.xml.lido.core.leaf.rightsHolder;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RightsHolderDAOImpl implements RightsHolderDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RightsHolder getRightsHolder(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new RightsHolder(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
