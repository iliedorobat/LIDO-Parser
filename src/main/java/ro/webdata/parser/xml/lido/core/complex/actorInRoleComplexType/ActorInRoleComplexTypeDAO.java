package ro.webdata.parser.xml.lido.core.complex.actorInRoleComplexType;

import org.w3c.dom.Node;

public interface ActorInRoleComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorInRoleComplexType</b> node type.
	 * @return <b>ActorInRoleComplexType</b>
	 */
	ActorInRoleComplexType getActorInRoleComplexType(Node node);
}
