package ro.webdata.parser.xml.lido.core.wrap.eventWrap;

import ro.webdata.parser.xml.lido.core.set.eventSet.EventSetDAO;
import ro.webdata.parser.xml.lido.core.set.eventSet.EventSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.eventSet.EventSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class EventWrapDAOImpl implements EventWrapDAO {
    private static EventSetDAO eventSetParser = new EventSetDAOImpl();

    public EventWrap getEventWrap(Node node) {
        ArrayList<EventSet> eventSetList = new ArrayList<EventSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:eventSet")) {
                eventSetList.add(eventSetParser.getEventSet(child));
            }
        }

        return new EventWrap(eventSetList);
    }
}
