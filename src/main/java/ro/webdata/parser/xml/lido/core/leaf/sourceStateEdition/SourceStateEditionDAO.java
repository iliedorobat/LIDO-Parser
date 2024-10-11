package ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition;

import org.w3c.dom.Node;

public interface SourceStateEditionDAO {
	/**
	 *
	 * @param node <b>lido:sourceStateEdition</b> node type.
	 * @return <b>SourceStateEdition</b>
	 */
	SourceStateEdition getSourceStateEdition(Node node);
}
