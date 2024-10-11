package ro.webdata.parser.xml.lido.core.complex.identifierComplexType;

import org.w3c.dom.Node;

public interface IdentifierComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:identifierComplexType</b> node type.
	 * @return <b>IdentifierComplexType</b>
	 */
	IdentifierComplexType getIdentifierComplexType(Node node);
}
