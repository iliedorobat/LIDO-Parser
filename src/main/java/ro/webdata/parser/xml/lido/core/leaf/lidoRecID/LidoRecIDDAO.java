package ro.webdata.parser.xml.lido.core.leaf.lidoRecID;

import org.w3c.dom.Node;

public interface LidoRecIDDAO {
	/**
	 *
	 * @param node <b>lido:lidoRecID</b> node type.
	 * @return <b>LidoRecID</b>
	 */
	LidoRecID getLidoRecID(Node node);
}
