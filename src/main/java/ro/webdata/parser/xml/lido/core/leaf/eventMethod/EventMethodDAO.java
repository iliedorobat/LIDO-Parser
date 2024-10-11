package ro.webdata.parser.xml.lido.core.leaf.eventMethod;

import org.w3c.dom.Node;

public interface EventMethodDAO {
	/**
	 *
	 * @param node <b>lido:eventMethod</b> node type.
	 * @return <b>EventMethod</b>
	 */
	EventMethod getEventMethod(Node node);
}
