package ro.webdata.parser.xml.lido.core.complex.webResourceComplexType;

import org.w3c.dom.Node;

public interface WebResourceComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:webResourceComplexType</b> node type.
	 * @return <b>WebResourceComplexType</b>
	 */
	WebResourceComplexType getWebResourceComplexType(Node node);
}
