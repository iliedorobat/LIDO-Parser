package ro.webdata.parser.xml.lido.core.complex.gmlComplexType;

import org.w3c.dom.Node;

public interface GmlComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:gmlComplexType</b> node type.
	 * @return <b>GmlComplexType</b>
	 */
	GmlComplexType getGmlComplexType(Node node);
}
