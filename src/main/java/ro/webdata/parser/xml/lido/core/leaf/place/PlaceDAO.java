package ro.webdata.parser.xml.lido.core.leaf.place;

import org.w3c.dom.Node;

public interface PlaceDAO {
	/**
	 *
	 * @param node <b>lido:place</b> node type.
	 * @return <b>Place</b>
	 */
	Place getPlace(Node node);
}
