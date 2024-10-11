package ro.webdata.parser.xml.lido.core.leaf.linkResource;

import org.w3c.dom.Node;

public interface LinkResourceDAO {
	/**
	 *
	 * @param node <b>lido:linkResource</b> node type.
	 * @return <b>LinkResource</b>
	 */
	LinkResource getLinkResource(Node node);
}
