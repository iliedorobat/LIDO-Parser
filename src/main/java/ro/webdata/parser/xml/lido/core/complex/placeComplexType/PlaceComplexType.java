package ro.webdata.parser.xml.lido.core.complex.placeComplexType;

import ro.webdata.parser.xml.lido.core.attribute.LidoGeographicalEntity;
import ro.webdata.parser.xml.lido.core.attribute.LidoPoliticalEntity;
import ro.webdata.parser.xml.lido.core.leaf.gml.Gml;
import ro.webdata.parser.xml.lido.core.leaf.partOfPlace.PartOfPlace;
import ro.webdata.parser.xml.lido.core.leaf.placeClassification.PlaceClassification;
import ro.webdata.parser.xml.lido.core.leaf.placeID.PlaceID;
import ro.webdata.parser.xml.lido.core.set.namePlaceSet.NamePlaceSet;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Structured element for place information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>placeID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique identifier for the place.<br/>
 * 				<b>How to record:</b> Preferably taken from a published authority file.
 * 			</div>
 * 			<b>namePlaceSet (lido:appellationComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The name of the geographic place. <br/>
 * 				<b>How to record:</b> If there are different names of the same place,
 * 				e.g. today's and historical names, repeat this element.
 * 			</div>
 * 			<b>gml (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Georeferences of the place using the GML specification.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.<br/>
 * 				<b>Notes:</b> For further documentation on GML refer to
 * 				<a href="http://www.opengis.net/gml/">http://www.opengis.net/gml/</a>.
 * 			</div>
 * 			<b>partOfPlace (lido:placeComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Allows for indexing larger geographical entities.
 * 			</div>
 * 			<b>placeClassification (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A classification of the place, e.g. by geological complex,
 * 				stratigraphic unit or habitat type.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>politicalEntity</b>
 * 			<div class="lido-attr-doc">
 * 				<b>Definition:</b> Data values can include: Gemeinde, Kreis, Bundesland,
 * 				Staat, Herzogtum, city, county, country, civil parish.
 * 			</div>
 * 			<b>geographicalEntity</b>
 * 			<div class="lido-attr-doc">
 * 				<b>Definition:</b> Data values can include: Naturraum, Landschaft, natural
 * 				environment, landscape.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class PlaceComplexType {
	private List<PlaceID> placeID;
	private List<NamePlaceSet> namePlaceSet;
	private List<Gml> gml;
	private List<PartOfPlace> partOfPlace;
	private List<PlaceClassification> placeClassification;
	private LidoPoliticalEntity lidoPoliticalEntity;
	private LidoGeographicalEntity lidoGeographicalEntity;

	public PlaceComplexType() {}

	public PlaceComplexType(List<PlaceID> placeID, List<NamePlaceSet> namePlaceSet,
			List<Gml> gml, List<PartOfPlace> partOfPlace, List<PlaceClassification> placeClassification,
			LidoPoliticalEntity politicalEntity, LidoGeographicalEntity geographicalEntity) {
		setPlaceID(placeID);
		setNamePlaceSet(namePlaceSet);
		setGml(gml);
		setPartOfPlace(partOfPlace);
		setPlaceClassification(placeClassification);
		setPoliticalEntity(politicalEntity);
		setGeographicalEntity(geographicalEntity);
	}

	public List<PlaceID> getPlaceID() {
		return placeID;
	}

	public void setPlaceID(List<PlaceID> placeID) {
		this.placeID = placeID;
	}

	public List<NamePlaceSet> getNamePlaceSet() {
		return namePlaceSet;
	}

	public void setNamePlaceSet(List<NamePlaceSet> namePlaceSet) {
		this.namePlaceSet = namePlaceSet;
	}

	public List<Gml> getGml() {
		return gml;
	}

	public void setGml(List<Gml> gml) {
		this.gml = gml;
	}

	public List<PartOfPlace> getPartOfPlace() {
		return partOfPlace;
	}

	public void setPartOfPlace(List<PartOfPlace> partOfPlace) {
		this.partOfPlace = partOfPlace;
	}

	public List<PlaceClassification> getPlaceClassification() {
		return placeClassification;
	}

	public void setPlaceClassification(List<PlaceClassification> placeClassification) {
		this.placeClassification = placeClassification;
	}

	public LidoPoliticalEntity getPoliticalEntity() {
		return lidoPoliticalEntity;
	}

	public void setPoliticalEntity(LidoPoliticalEntity politicalEntity) {
		this.lidoPoliticalEntity = politicalEntity;
	}

	public LidoGeographicalEntity getGeographicalEntity() {
		return lidoGeographicalEntity;
	}

	public void setGeographicalEntity(LidoGeographicalEntity geographicalEntity) {
		this.lidoGeographicalEntity = geographicalEntity;
	}
}
