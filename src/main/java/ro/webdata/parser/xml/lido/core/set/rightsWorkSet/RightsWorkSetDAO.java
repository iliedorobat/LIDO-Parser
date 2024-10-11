package ro.webdata.parser.xml.lido.core.set.rightsWorkSet;

import org.w3c.dom.Node;

public interface RightsWorkSetDAO {
	/**
	 *
	 * @param node <b>lido:rightsWorkSet</b> node type.
	 * @return <b>RightsWorkSet</b>
	 */
	RightsWorkSet getRightsWorkSet(Node node);
}
