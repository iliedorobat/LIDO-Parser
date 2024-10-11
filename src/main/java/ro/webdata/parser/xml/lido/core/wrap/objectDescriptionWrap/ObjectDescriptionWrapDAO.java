package ro.webdata.parser.xml.lido.core.wrap.objectDescriptionWrap;

import org.w3c.dom.Node;

public interface ObjectDescriptionWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectDescriptionWrap</b> node type.
	 * @return <b>ObjectDescriptionWrap</b>
	 */
	ObjectDescriptionWrap getObjectDescriptionWrap(Node node);
}
