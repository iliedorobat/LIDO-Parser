package ro.webdata.parser.xml.lido.core.leaf.termMaterialsTech;

import org.w3c.dom.Node;

public interface TermMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:termMaterialsTech</b> node type.
	 * @return <b>TermMaterialsTech</b>
	 */
	TermMaterialsTech getTermMaterialsTech(Node node);
}
