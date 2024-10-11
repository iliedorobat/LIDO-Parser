package ro.webdata.parser.xml.lido.core.leaf.rightsType;

import org.w3c.dom.Node;

public interface RightsTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsType</b> node type.
	 * @return <b>RightsType</b>
	 */
	RightsType getRightsType(Node node);
}
