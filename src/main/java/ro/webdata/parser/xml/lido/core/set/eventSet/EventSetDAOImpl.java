package ro.webdata.parser.xml.lido.core.set.eventSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;

import java.util.Map;

public class EventSetDAOImpl implements EventSetDAO {
    private EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public EventSet getEventSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new EventSet(
                eventSetComplexTypeDAO.getEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
