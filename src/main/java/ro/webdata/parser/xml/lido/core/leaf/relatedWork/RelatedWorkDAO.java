package ro.webdata.parser.xml.lido.core.leaf.relatedWork;

import org.w3c.dom.Node;

public interface RelatedWorkDAO {
	/**
	 *
	 * @param node <b>lido:relatedWork</b> node type.
	 * @return <b>RelatedWork</b>
	 */
	RelatedWork getRelatedWork(Node node);
}
