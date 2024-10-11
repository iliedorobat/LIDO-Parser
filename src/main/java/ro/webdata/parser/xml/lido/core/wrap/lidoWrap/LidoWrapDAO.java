package ro.webdata.parser.xml.lido.core.wrap.lidoWrap;

import org.w3c.dom.Node;

public interface LidoWrapDAO {
	/**
	 *
	 * @param node <b>lido:lidoWrap</b> node type.
	 * @return <b>LidoWrap</b>
	 */
	LidoWrap getLidoWrap(Node node);
}
