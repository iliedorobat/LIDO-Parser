package ro.webdata.parser.xml.lido.core.leaf.legalBodyID;

import org.w3c.dom.Node;

public interface LegalBodyIDDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyID</b> node type.
	 * @return <b>LegalBodyID</b>
	 */
	LegalBodyID getLegalBodyID(Node node);
}
