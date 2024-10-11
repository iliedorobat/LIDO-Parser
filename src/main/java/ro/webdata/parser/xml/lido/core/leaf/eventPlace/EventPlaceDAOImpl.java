package ro.webdata.parser.xml.lido.core.leaf.eventPlace;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventPlaceDAOImpl implements EventPlaceDAO {
    private static PlaceSetComplexTypeDAO placeSetComplexTypeDAO = new PlaceSetComplexTypeDAOImpl();

    public EventPlace getEventPlace(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new EventPlace(
                placeSetComplexTypeDAO.getPlaceSetComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
