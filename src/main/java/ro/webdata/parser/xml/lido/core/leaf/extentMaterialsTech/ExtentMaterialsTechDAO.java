package ro.webdata.parser.xml.lido.core.leaf.extentMaterialsTech;

import org.w3c.dom.Node;

public interface ExtentMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:extentMaterialsTech</b> node type.
	 * @return <b>ExtentMaterialsTech</b>
	 */
	ExtentMaterialsTech getExtentMaterialsTech(Node node);
}
