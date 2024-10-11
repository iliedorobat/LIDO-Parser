package ro.webdata.parser.xml.lido.core.leaf.rightsHolder;

import org.w3c.dom.Node;

public interface RightsHolderDAO {
	/**
	 *
	 * @param node <b>lido:rightsHolder</b> node type.
	 * @return <b>RightsHolder</b>
	 */
	RightsHolder getRightsHolder(Node node);
}
