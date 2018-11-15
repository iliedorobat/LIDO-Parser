package ro.webdata.lido.parser.core.leaf.workID;

import org.w3c.dom.Node;

public interface WorkIDDAO {
	/**
	 *
	 * @param node <b>lido:WorkID</b> node type.
	 * @return <b>WorkID</b>
	 */
	WorkID getWorkID(Node node);
}
