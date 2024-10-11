package ro.webdata.parser.xml.lido.core.leaf.displayObject;

import org.w3c.dom.Node;

public interface DisplayObjectDAO {
	/**
	 *
	 * @param node <b>lido:displayObject</b> node type.
	 * @return <b>DisplayObject</b>
	 */
	DisplayObject getDisplayObject(Node node);
}
