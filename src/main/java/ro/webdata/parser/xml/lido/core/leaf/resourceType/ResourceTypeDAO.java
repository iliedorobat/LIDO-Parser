package ro.webdata.parser.xml.lido.core.leaf.resourceType;

import org.w3c.dom.Node;

public interface ResourceTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceType</b> node type.
	 * @return <b>ResourceType</b>
	 */
	ResourceType getResourceType(Node node);
}
