package ro.webdata.parser.xml.lido.core.set.eventSet;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventSetDAOImpl implements EventSetDAO {
    private EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public EventSet getEventSet(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new EventSet(
                eventSetComplexTypeDAO.getEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
