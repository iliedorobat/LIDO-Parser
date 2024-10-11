package ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink;

import org.w3c.dom.Node;

public interface LegalBodyWeblinkDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyWeblink</b> node type.
	 * @return <b>LegalBodyWeblink</b>
	 */
	LegalBodyWeblink getLegalBodyWeblink(Node node);
}
