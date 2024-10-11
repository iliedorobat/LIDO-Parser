package ro.webdata.parser.xml.lido.core.leaf.partOfPlace;

import org.w3c.dom.Node;

public interface PartOfPlaceDAO {
	/**
	 *
	 * @param node <b>lido:partOfPlace</b> node type.
	 * @return <b>PartOfPlace</b>
	 */
	PartOfPlace getPartOfPlace(Node node);
}
