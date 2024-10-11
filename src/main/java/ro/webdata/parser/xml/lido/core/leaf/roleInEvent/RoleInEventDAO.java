package ro.webdata.parser.xml.lido.core.leaf.roleInEvent;

import org.w3c.dom.Node;

public interface RoleInEventDAO {
	/**
	 *
	 * @param node <b>lido:roleInEvent</b> node type.
	 * @return <b>RoleInEvent</b>
	 */
	RoleInEvent getRoleInEvent(Node node);
}
