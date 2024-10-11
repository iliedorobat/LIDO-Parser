package ro.webdata.parser.xml.lido.core.leaf.earliestDate;

import org.w3c.dom.Node;

public interface EarliestDateDAO {
	/**
	 *
	 * @param node <b>lido:earliestDate</b> node type.
	 * @return <b>EarliestDate</b>
	 */
	EarliestDate getEarliestDate(Node node);
}
