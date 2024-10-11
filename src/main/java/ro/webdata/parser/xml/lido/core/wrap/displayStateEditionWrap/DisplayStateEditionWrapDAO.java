package ro.webdata.parser.xml.lido.core.wrap.displayStateEditionWrap;

import org.w3c.dom.Node;

public interface DisplayStateEditionWrapDAO {
	/**
	 *
	 * @param node <b>lido:displayStateEditionWrap</b> node type.
	 * @return <b>DisplayStateEditionWrap</b>
	 */
	DisplayStateEditionWrap getDisplayStateEditionWrap(Node node);
}
