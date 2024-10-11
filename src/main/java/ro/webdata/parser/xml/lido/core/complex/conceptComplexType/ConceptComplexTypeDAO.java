package ro.webdata.parser.xml.lido.core.complex.conceptComplexType;

import org.w3c.dom.Node;

public interface ConceptComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:conceptComplexType</b> node type.
	 * @return <b>ConceptComplexType</b>
	 */
	ConceptComplexType getConceptComplexType(Node node);
}
