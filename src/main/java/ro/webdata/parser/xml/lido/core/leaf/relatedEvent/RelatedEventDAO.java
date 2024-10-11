package ro.webdata.parser.xml.lido.core.leaf.relatedEvent;

import org.w3c.dom.Node;

public interface RelatedEventDAO {
	/**
	 *
	 * @param node <b>lido:relatedEvent</b> node type.
	 * @return <b>RelatedEvent</b>
	 */
	RelatedEvent getRelatedEvent(Node node);
}
