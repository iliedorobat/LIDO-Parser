package ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap;

import org.w3c.dom.Node;

public interface RelatedWorksWrapDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorksWrap</b> node type.
	 * @return <b>RelatedWorksWrap</b>
	 */
	RelatedWorksWrap getRelatedWorksWrap(Node node);
}
