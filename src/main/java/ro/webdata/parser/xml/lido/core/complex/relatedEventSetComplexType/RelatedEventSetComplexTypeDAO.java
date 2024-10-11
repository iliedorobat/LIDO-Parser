package ro.webdata.parser.xml.lido.core.complex.relatedEventSetComplexType;

import org.w3c.dom.Node;

public interface RelatedEventSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventSetComplexType</b> node type and.
	 * @return <b>RelatedEventSetComplexType</b>
	 */
	RelatedEventSetComplexType getRelatedEventSetComplexType(Node node);
}
