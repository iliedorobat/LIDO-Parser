package ro.webdata.parser.xml.lido.core.complex.actorSetComplexType;

import org.w3c.dom.Node;

public interface ActorSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorSetComplexType</b> node type.
	 * @return <b>ActorSetComplexType</b>
	 */
	ActorSetComplexType getActorSetComplexType(Node node);
}
