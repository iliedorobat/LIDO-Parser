package ro.webdata.parser.xml.lido.core.leaf.materialsTech;

import org.w3c.dom.Node;

public interface MaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:displayMaterialsTech</b> node type.
	 * @return <b>MaterialsTech</b>
	 */
	MaterialsTech getMaterialsTech(Node node);
}
