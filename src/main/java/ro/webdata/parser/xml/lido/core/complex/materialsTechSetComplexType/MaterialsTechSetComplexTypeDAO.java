package ro.webdata.parser.xml.lido.core.complex.materialsTechSetComplexType;

import org.w3c.dom.Node;

public interface MaterialsTechSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:materialsTechSetComplexType</b> node type.
	 * @return <b>MaterialsTechSetComplexType</b>
	 */
	MaterialsTechSetComplexType getMaterialsTechSetComplexType(Node node);
}
