package ro.webdata.parser.xml.lido.core.leaf.resourcePerspective;

import org.w3c.dom.Node;

public interface ResourcePerspectiveDAO {
	/**
	 *
	 * @param node <b>lido:resourcePerspective</b> node type.
	 * @return <b>ResourcePerspective</b>
	 */
	ResourcePerspective getResourcePerspective(Node node);
}
