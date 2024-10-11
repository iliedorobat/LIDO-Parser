package ro.webdata.parser.xml.lido.core.leaf.classification;

import org.w3c.dom.Node;

public interface ClassificationDAO {
	/**
	 *
	 * @param node <b>lido:classification</b> node type.
	 * @return <b>Classification</b>
	 */
	Classification getClassification(Node node);
}
