package ro.webdata.lido.parser.core.complex.eventComplexType;

import org.w3c.dom.Node;

public interface EventComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventComplexType</b> node type.
	 * @return <b>EventComplexType</b>
	 */
	EventComplexType getEventComplexType(Node node);
}
