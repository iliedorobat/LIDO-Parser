package ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap;

import org.w3c.dom.Node;

public interface ObjectRelationWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectRelationWrap</b> node type.
	 * @return <b>ObjectRelationWrap</b>
	 */
	ObjectRelationWrap getObjectRelationWrap(Node node);
}
