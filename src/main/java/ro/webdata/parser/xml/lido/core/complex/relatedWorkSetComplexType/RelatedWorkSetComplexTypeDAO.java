package ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType;

import org.w3c.dom.Node;

public interface RelatedWorkSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorkSetComplexType</b> node type and.
	 * @return <b>RelatedWorkSetComplexType</b>
	 */
	RelatedWorkSetComplexType getRelatedWorkSetComplexType(Node node);
}
