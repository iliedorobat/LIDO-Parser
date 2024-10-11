package ro.webdata.parser.xml.lido.core.wrap.eventWrap;

import org.w3c.dom.Node;

public interface EventWrapDAO {
	/**
	 *
	 * @param node <b>lido:eventWrap</b> node type.
	 * @return <b>EventWrap</b>
	 */
	EventWrap getEventWrap(Node node);
}
