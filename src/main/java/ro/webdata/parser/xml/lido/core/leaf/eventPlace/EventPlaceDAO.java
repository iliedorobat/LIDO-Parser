package ro.webdata.parser.xml.lido.core.leaf.eventPlace;

import org.w3c.dom.Node;

public interface EventPlaceDAO {
	/**
	 *
	 * @param node <b>lido:eventPlace</b> node type.
	 * @return <b>EventPlace</b>
	 */
	EventPlace getEventPlace(Node node);
}
