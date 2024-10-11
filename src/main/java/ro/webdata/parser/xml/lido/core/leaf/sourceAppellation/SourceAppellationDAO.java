package ro.webdata.parser.xml.lido.core.leaf.sourceAppellation;

import org.w3c.dom.Node;

public interface SourceAppellationDAO {
	/**
	 *
	 * @param node <b>lido:sourceAppellation</b> node type.
	 * @return <b>SourceAppellationDAO</b>
	 */
	SourceAppellation getSourceAppellation(Node node);
}
