package ro.webdata.parser.xml.lido.core.complex.eventSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.displayEvent.DisplayEvent;
import ro.webdata.parser.xml.lido.core.leaf.displayEvent.DisplayEventDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayEvent.DisplayEventDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.event.Event;
import ro.webdata.parser.xml.lido.core.leaf.event.EventDAO;
import ro.webdata.parser.xml.lido.core.leaf.event.EventDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class EventSetComplexTypeDAOImpl implements EventSetComplexTypeDAO {
    private static DisplayEventDAO displayEventParser = new DisplayEventDAOImpl();
    private static EventDAO eventParser = new EventDAOImpl();

    public EventSetComplexType getEventSetComplexType(Node node) {
        List<DisplayEvent> displayEventList = new ArrayList<DisplayEvent>();
        Event event = new Event();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayEvent":
                    displayEventList.add(displayEventParser.getDisplayEvent(child));
                    break;
                case "lido:event":
                    event = eventParser.getDisplayEvent(child);
                    break;
                default: break;
            }
        }

        return new EventSetComplexType(displayEventList, event);
    }
}
