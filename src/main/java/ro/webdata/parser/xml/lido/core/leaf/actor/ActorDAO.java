package ro.webdata.parser.xml.lido.core.leaf.actor;

import org.w3c.dom.Node;

public interface ActorDAO {
	/**
	 *
	 * @param node <b>lido:actor</b> node type.
	 * @return <b>Actor</b>
	 */
	Actor getActor(Node node);
}
