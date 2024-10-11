package ro.webdata.parser.xml.lido.core.complex.textComplexType;

import org.w3c.dom.Node;

public interface TextComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:textComplexType</b> node type.
	 * @return <b>TextComplexType</b>
	 */
	TextComplexType getTextComplexType(Node node);
}
