package ro.webdata.parser.xml.lido.core.leaf.rightsResource;

import org.w3c.dom.Node;

public interface RightsResourceDAO {
	/**
	 *
	 * @param node <b>lido:rightsResource</b> node type.
	 * @return <b>RightsResource</b>
	 */
	RightsResource getRightsResource(Node node);
}
