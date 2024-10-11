package ro.webdata.parser.xml.lido.core.leaf.latestDate;

import org.w3c.dom.Node;

public interface LatestDateDAO {
	/**
	 *
	 * @param node <b>lido:latestDate</b> node type.
	 * @return <b>LatestDate</b>
	 */
	LatestDate getLatestDate(Node node);
}
