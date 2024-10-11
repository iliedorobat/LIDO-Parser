package ro.webdata.parser.xml.lido.core.leaf.placeID;

import org.w3c.dom.Node;

public interface PlaceIDDAO {
	/**
	 *
	 * @param node <b>lido:placeID</b> node type.
	 * @return <b>getPlaceID</b>
	 */
	PlaceID getPlaceID(Node node);
}
