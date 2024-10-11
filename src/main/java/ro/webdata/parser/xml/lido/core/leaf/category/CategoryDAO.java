package ro.webdata.parser.xml.lido.core.leaf.category;

import org.w3c.dom.Node;

public interface CategoryDAO {
	/**
	 *
	 * @param node <b>lido:category</b> node type.
	 * @return <b>Category</b>
	 */
	Category getCategory(Node node);
}
