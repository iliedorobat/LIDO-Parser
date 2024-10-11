package ro.webdata.parser.xml.lido.core.leaf.resourceSource;

import org.w3c.dom.Node;

public interface ResourceSourceDAO {
	/**
	 *
	 * @param node <b>lido:resourceSource</b> node type.
	 * @return <b>ResourceSource</b>
	 */
	ResourceSource getResourceSource(Node node);
}
