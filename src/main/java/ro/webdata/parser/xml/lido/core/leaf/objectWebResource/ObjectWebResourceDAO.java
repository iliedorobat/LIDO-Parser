package ro.webdata.parser.xml.lido.core.leaf.objectWebResource;

import org.w3c.dom.Node;

public interface ObjectWebResourceDAO {
	/**
	 *
	 * @param node <b>lido:objectWebResource</b> node type.
	 * @return <b>ObjectWebResource</b>
	 */
	ObjectWebResource getObjectWebResource(Node node);
}
