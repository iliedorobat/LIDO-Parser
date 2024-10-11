package ro.webdata.parser.xml.lido.core.leaf.resourceRelType;

import org.w3c.dom.Node;

public interface ResourceRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceRelType</b> node type.
	 * @return <b>ResourceRelType</b>
	 */
	ResourceRelType getResourceRelType(Node node);
}
