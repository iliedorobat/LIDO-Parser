package ro.webdata.parser.xml.lido.core.complex.actorComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.actorID.ActorID;
import ro.webdata.parser.xml.lido.core.leaf.genderActor.GenderActor;
import ro.webdata.parser.xml.lido.core.leaf.nationalityActor.NationalityActor;
import ro.webdata.parser.xml.lido.core.leaf.vitalDatesActor.VitalDatesActor;
import ro.webdata.parser.xml.lido.core.set.nameActorSet.NameActorSet;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Contains identifying and indexing actor information.<br/>
 * 		<b>How to record:</b> Data values of the type attribute: person, corporation, family, group.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>actorID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique identifier for the actor.<br/>
 * 				<b>How to record:</b> Preferably taken from a published authority file.
 * 			</div>
 * 			<b>nameActorSet (lido:appellationComplexType 1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A wrapper for name elements.<br/>
 * 				<b>How to record:</b> If there exists more than one name for a single actor, repeat Name Actor Set.<br/>
 * 				<b>Notes:</b> Indicates names, appellations, or other identifiers assigned to an individual, group of people,
 * 				firm or other corporate body, or other entity.
 * 			</div>
 * 			<b>nationalityActor (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> National or cultural affiliation of the person or corporate body.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 			</div>
 * 			<b>vitalDatesActor (lido:dateComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The lifespan of the person or the existence of the corporate body or group.<br/>
 * 				<b>How to record:</b> For individuals, record birth date as earliest and death date as latest date,
 * 				estimated where necessary. For a corporate body or group, record the dates of founding and dissolution.
 * 				Although this is not a mandatory field the use of birth date and death date is strongly recommended for
 * 				unambigous identification of individuals. The type attribute of earliest and latest date may specify for
 * 				indiviudals, if birth and death dates or if dates of activity are recorded. Data values for type attribute
 * 				may include: birthDate, deathDate, estimatedDate.
 * 			</div>
 * 			<b>genderActor (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The sex of the individual.<br/>
 * 				<b>How to record:</b> Data values: male, female, unknown, not applicable.
 * 				Repeat this element for language variants only.<br/>
 * 				<b>Notes:</b> Not applicable for corporate bodies.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b>
 * 			<div class="lido-attr-doc">
 * 				<b>Definition:</b> Indicates if the actor is an individual, a group of individuals, a family or
 * 				a corporation (firm or other corporate body).<br/>
 * 				<b>How to record:</b> Data values: person, group, family, corporation.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ActorComplexType {
	private ArrayList<ActorID> actorID;
	private ArrayList<NameActorSet> nameActorSet;
	private ArrayList<NationalityActor> nationalityActor;
	private VitalDatesActor vitalDatesActor;
	private ArrayList<GenderActor> genderActor;
	private LidoType type;
	private PrintMessages printMessages = new PrintMessages();

	public ActorComplexType() {}

	public ActorComplexType(ArrayList<ActorID> actorID, ArrayList<NameActorSet> nameActorSet,
			ArrayList<NationalityActor> nationalityActor, VitalDatesActor vitalDatesActor,
			ArrayList<GenderActor> genderActor, LidoType type) {
		setActorID(actorID);
		setGenderActor(genderActor);
		setNameActorSet(nameActorSet);
		setNationalityActor(nationalityActor);
		setVitalDatesActor(vitalDatesActor);
		setType(type);

		if (nameActorSet == null || nameActorSet.isEmpty()) {
			printMessages.printEmptyArray(ActorComplexType.class, "lido:nameActorSet");
		}
	}

	public ArrayList<ActorID> getActorID() {
		return actorID;
	}

	public void setActorID(ArrayList<ActorID> actorID) {
		this.actorID = actorID;
	}

	public ArrayList<NameActorSet> getNameActorSet() {
		return nameActorSet;
	}

	public void setNameActorSet(ArrayList<NameActorSet> nameActorSet) {
		this.nameActorSet = nameActorSet;
	}

	public ArrayList<NationalityActor> getNationalityActor() {
		return nationalityActor;
	}

	public void setNationalityActor(ArrayList<NationalityActor> nationalityActor) {
		this.nationalityActor = nationalityActor;
	}

	public VitalDatesActor getVitalDatesActor() {
		return vitalDatesActor;
	}

	public void setVitalDatesActor(VitalDatesActor vitalDatesActor) {
		this.vitalDatesActor = vitalDatesActor;
	}

	public ArrayList<GenderActor> getGenderActor() {
		return genderActor;
	}

	public void setGenderActor(ArrayList<GenderActor> genderActor) {
		this.genderActor = genderActor;
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}
}
