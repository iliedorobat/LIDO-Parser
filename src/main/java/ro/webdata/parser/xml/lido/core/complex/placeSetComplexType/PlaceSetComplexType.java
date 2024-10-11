package ro.webdata.parser.xml.lido.core.complex.placeSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.displayPlace.DisplayPlace;
import ro.webdata.parser.xml.lido.core.leaf.place.Place;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for place information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayPlace (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for a place specification, corresponding to
 * 				the following place element.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>place (lido:placeComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Contains structured identifying and indexing information
 * 				for a geographical entity.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class PlaceSetComplexType {
	private ArrayList<DisplayPlace> displayPlace;
	private Place place;

	public PlaceSetComplexType() {}

	public PlaceSetComplexType(ArrayList<DisplayPlace> displayPlace, Place place) {
		setDisplayPlace(displayPlace);
		setPlace(place);
	}

	public ArrayList<DisplayPlace> getDisplayPlace() {
		return displayPlace;
	}

	public void setDisplayPlace(ArrayList<DisplayPlace> displayPlace) {
		this.displayPlace = displayPlace;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
}
