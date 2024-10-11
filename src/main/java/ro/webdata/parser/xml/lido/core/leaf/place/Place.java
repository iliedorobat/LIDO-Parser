package ro.webdata.parser.xml.lido.core.leaf.place;

import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Contains structured identifying and indexing information
 * 			for a geographical entity.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Place extends PlaceComplexType {
	public Place() {}

	public Place(PlaceComplexType placeComplexType) {
		super(
			placeComplexType.getPlaceID(),
			placeComplexType.getNamePlaceSet(),
			placeComplexType.getGml(),
			placeComplexType.getPartOfPlace(),
			placeComplexType.getPlaceClassification(),
			placeComplexType.getPoliticalEntity(),
			placeComplexType.getGeographicalEntity()
		);
	}
}
