package ro.webdata.parser.xml.lido.core.leaf.relatedWorkRelType;

import org.w3c.dom.Node;

public interface RelatedWorkRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorkRelType</b> node type.
	 * @return <b>RelatedWorkRelType</b>
	 */
	RelatedWorkRelType getRelatedWorkRelType(Node node);
}
