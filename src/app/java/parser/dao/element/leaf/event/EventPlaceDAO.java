package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventPlace;
import org.w3c.dom.Node;

public interface EventPlaceDAO {
	/**
	 *
	 * @param node <b>lido:eventPlace</b> node type.
	 * @return <b>EventPlace</b>
	 */
	EventPlace getEventPlace(Node node);
}