package ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap;

import org.w3c.dom.Node;

public interface ObjectClassificationWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectClassificationWrap</b> node type.
	 * @return <b>ObjectClassificationWrap</b>
	 */
	ObjectClassificationWrap getObjectClassificationWrap(Node node);
}
