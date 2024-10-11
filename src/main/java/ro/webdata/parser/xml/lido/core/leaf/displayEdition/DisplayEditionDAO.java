package ro.webdata.parser.xml.lido.core.leaf.displayEdition;

import org.w3c.dom.Node;

public interface DisplayEditionDAO {
	/**
	 *
	 * @param node <b>lido:displayEdition</b> node type.
	 * @return <b>DisplayEdition</b>
	 */
	DisplayEdition getDisplayEdition(Node node);
}
