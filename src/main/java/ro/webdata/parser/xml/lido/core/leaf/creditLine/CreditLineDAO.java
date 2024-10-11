package ro.webdata.parser.xml.lido.core.leaf.creditLine;

import org.w3c.dom.Node;

public interface CreditLineDAO {
	/**
	 *
	 * @param node <b>lido:creditLine</b> node type.
	 * @return <b>CreditLine</b>
	 */
	CreditLine getCreditLine(Node node);
}
