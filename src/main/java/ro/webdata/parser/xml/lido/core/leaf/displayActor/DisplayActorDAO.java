package ro.webdata.parser.xml.lido.core.leaf.displayActor;

import org.w3c.dom.Node;

public interface DisplayActorDAO {
	/**
	 *
	 * @param node <b>lido:displayActor</b> node type.
	 * @return <b>DisplayActor</b>
	 */
	DisplayActor getDisplayActor(Node node);
}
