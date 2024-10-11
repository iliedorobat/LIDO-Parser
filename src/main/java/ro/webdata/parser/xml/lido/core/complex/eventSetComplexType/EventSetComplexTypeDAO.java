package ro.webdata.parser.xml.lido.core.complex.eventSetComplexType;

import org.w3c.dom.Node;

public interface EventSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventSetComplexType</b> node type.
	 * @return <b>EventSetComplexType</b>
	 */
	EventSetComplexType getEventSetComplexType(Node node);
}
