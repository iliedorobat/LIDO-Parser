package ro.webdata.parser.xml.lido.core.leaf.partOfPlace;

import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Allows for indexing larger geographical entities.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class PartOfPlace extends PlaceComplexType {
	public PartOfPlace() {}

	public PartOfPlace(PlaceComplexType placeComplexType) {
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
