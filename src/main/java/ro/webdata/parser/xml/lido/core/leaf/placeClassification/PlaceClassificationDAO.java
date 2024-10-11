package ro.webdata.parser.xml.lido.core.leaf.placeClassification;

import org.w3c.dom.Node;

public interface PlaceClassificationDAO {
	/**
	 *
	 * @param node <b>lido:placeClassification</b> node type.
	 * @return <b>PlaceClassification</b>
	 */
	PlaceClassification getPlaceClassification(Node node);
}
