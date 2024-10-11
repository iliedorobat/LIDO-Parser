package ro.webdata.parser.xml.lido.core.set.relatedEventSet;

import org.w3c.dom.Node;

public interface RelatedEventSetDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventSet</b> node type.
	 * @return <b>RelatedEventSet</b>
	 */
	RelatedEventSet getRelatedEventSet(Node node);
}
