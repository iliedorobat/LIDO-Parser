package ro.webdata.parser.xml.lido.core.leaf.eventType;

import org.w3c.dom.Node;

public interface EventTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventType</b> node type.
	 * @return <b>EventType</b>
	 */
	EventType getEventType(Node node);
}
