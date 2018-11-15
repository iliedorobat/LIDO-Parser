package ro.webdata.lido.parser.core.set.eventSet;

import org.w3c.dom.Node;

public interface EventSetDAO {
	/**
	 *
	 * @param node <b>lido:eventSet</b> node type.
	 * @return <b>EventSet</b>
	 */
	EventSet getEventSet(Node node);
}
