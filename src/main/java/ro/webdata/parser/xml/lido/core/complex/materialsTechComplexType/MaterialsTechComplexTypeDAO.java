package ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType;

import org.w3c.dom.Node;

public interface MaterialsTechComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:materialsTechComplexType</b> node type.
	 * @return <b>MaterialsTechComplexType</b>
	 */
	MaterialsTechComplexType getMaterialsTechComplexType(Node node);
}
