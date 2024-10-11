package ro.webdata.parser.xml.lido.core.leaf.eventName;

import org.w3c.dom.Node;

public interface EventNameDAO {
	/**
	 *
	 * @param node <b>lido:eventName</b> node type.
	 * @return <b>EventName</b>
	 */
	EventName getEventName(Node node);
}
