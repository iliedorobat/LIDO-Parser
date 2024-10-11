package ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType;

import org.w3c.dom.Node;

public interface LegalBodyRefComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyRefComplexType</b> node type.
	 * @return <b>LegalBodyRefComplexType</b>
	 */
	LegalBodyRefComplexType getLegalBodyRefComplexType(Node node);
}
