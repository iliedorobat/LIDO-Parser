package ro.webdata.parser.xml.lido.core.leaf.object;

import org.w3c.dom.Node;

public interface ObjectDAO {
	/**
	 *
	 * @param node <b>lido:object</b> node type.
	 * @return <b>Object</b>
	 */
	Object getObject(Node node);
}
