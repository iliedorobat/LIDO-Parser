package ro.webdata.parser.xml.lido.core.leaf.rightsDate;

import org.w3c.dom.Node;

public interface RightsDateDAO {
	/**
	 *
	 * @param node <b>lido:rightsDate</b> node type.
	 * @return <b>RightsDate</b>
	 */
	RightsDate getRightsDate(Node node);
}
