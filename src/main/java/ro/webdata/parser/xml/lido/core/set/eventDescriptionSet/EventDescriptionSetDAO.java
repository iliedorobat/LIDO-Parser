package ro.webdata.parser.xml.lido.core.set.eventDescriptionSet;

import org.w3c.dom.Node;

public interface EventDescriptionSetDAO {
	/**
	 *
	 * @param node <b>lido:eventDescriptionSet</b> node type.
	 * @return <b>EventDescriptionSet</b>
	 */
	EventDescriptionSet getEventDescriptionSet(Node node);
}
