package ro.webdata.parser.xml.lido.core.leaf.roleActor;

import org.w3c.dom.Node;

public interface RoleActorDAO {
	/**
	 *
	 * @param node <b>lido:roleActor</b> node type.
	 * @return <b>RoleActor</b>
	 */
	RoleActor getRoleActor(Node node);
}
