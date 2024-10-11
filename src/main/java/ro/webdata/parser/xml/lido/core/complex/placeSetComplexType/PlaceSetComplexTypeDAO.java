package ro.webdata.parser.xml.lido.core.complex.placeSetComplexType;

import org.w3c.dom.Node;

public interface PlaceSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:placeSetComplexType</b> node type.
	 * @return <b>PlaceSetComplexType</b>
	 */
	PlaceSetComplexType getPlaceSetComplexType(Node node);
}
