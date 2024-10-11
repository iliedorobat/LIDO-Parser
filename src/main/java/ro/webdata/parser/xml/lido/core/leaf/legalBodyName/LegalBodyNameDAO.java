package ro.webdata.parser.xml.lido.core.leaf.legalBodyName;

import org.w3c.dom.Node;

public interface LegalBodyNameDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyName</b> node type.
	 * @return <b>LegalBodyName</b>
	 */
	LegalBodyName getLegalBodyName(Node node);
}
