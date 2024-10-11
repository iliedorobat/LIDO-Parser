package ro.webdata.parser.xml.lido.core.leaf.actorID;

import org.w3c.dom.Node;

public interface ActorIDDAO {
	/**
	 *
	 * @param node <b>lido:actorID</b> node type.
	 * @return <b>ActorID</b>
	 */
	ActorID getActorID(Node node);
}
