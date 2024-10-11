package ro.webdata.parser.xml.lido.core.complex.placeComplexType;

import org.w3c.dom.Node;

public interface PlaceComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:placeComplexType</b> node type.
	 * @return <b>PlaceComplexType</b>
	 */
	PlaceComplexType getPlaceComplexType(Node node);
}
