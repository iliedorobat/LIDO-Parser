package ro.webdata.parser.xml.lido.core.leaf.displayEvent;

import org.w3c.dom.Node;

public interface DisplayEventDAO {
	/**
	 *
	 * @param node <b>lido:displayEvent</b> node type.
	 * @return <b>DisplayEvent</b>
	 */
	DisplayEvent getDisplayEvent(Node node);
}
