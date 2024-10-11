package ro.webdata.parser.xml.lido.core.leaf.eventDate;

import org.w3c.dom.Node;

public interface EventDateDAO {
	/**
	 *
	 * @param node <b>lido:eventDate</b> node type.
	 * @return <b>EventDate</b>
	 */
	EventDate getDisplayEvent(Node node);
}
