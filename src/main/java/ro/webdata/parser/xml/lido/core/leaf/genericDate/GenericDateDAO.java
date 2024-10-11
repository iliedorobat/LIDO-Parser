package ro.webdata.parser.xml.lido.core.leaf.genericDate;

import org.w3c.dom.Node;

public interface GenericDateDAO {
	/**
	 *
	 * @param node <b>lido:earliestDate</b> and <b>lido:latestDate</b> node types.
	 * @return <b>GenericDate</b>
	 */
	GenericDate getGenericDate(Node node);
}
