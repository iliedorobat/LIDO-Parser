package ro.webdata.parser.xml.lido.core.complex.rightsComplexType;

import org.w3c.dom.Node;

public interface RightsComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsComplexType</b> node type.
	 * @return <b>RightsComplexType</b>
	 */
	RightsComplexType getRightsComplexType(Node node);
}
