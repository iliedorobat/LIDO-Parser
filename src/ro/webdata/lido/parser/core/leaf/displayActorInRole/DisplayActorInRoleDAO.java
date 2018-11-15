package ro.webdata.lido.parser.core.leaf.displayActorInRole;

import org.w3c.dom.Node;

public interface DisplayActorInRoleDAO {
	/**
	 *
	 * @param node <b>lido:displayActorInRole</b> node type.
	 * @return <b>DisplayActorInRole</b>
	 */
	DisplayActorInRole getDisplayActorInRole(Node node);
}
