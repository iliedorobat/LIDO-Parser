package ro.webdata.parser.xml.lido.core.leaf.conceptID;

import org.w3c.dom.Node;

public interface ConceptIDDAO {
	/**
	 *
	 * @param node <b>lido:conceptID</b> node type.
	 * @return <b>ConceptID</b>
	 */
	ConceptID getConceptID(Node node);
}
