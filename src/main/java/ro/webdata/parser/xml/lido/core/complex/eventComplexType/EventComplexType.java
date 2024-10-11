package ro.webdata.parser.xml.lido.core.complex.eventComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.culture.Culture;
import ro.webdata.parser.xml.lido.core.leaf.eventActor.EventActor;
import ro.webdata.parser.xml.lido.core.leaf.eventDate.EventDate;
import ro.webdata.parser.xml.lido.core.leaf.eventID.EventID;
import ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech.EventMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.eventMethod.EventMethod;
import ro.webdata.parser.xml.lido.core.leaf.eventName.EventName;
import ro.webdata.parser.xml.lido.core.leaf.eventPlace.EventPlace;
import ro.webdata.parser.xml.lido.core.leaf.eventType.EventType;
import ro.webdata.parser.xml.lido.core.leaf.periodName.PeriodName;
import ro.webdata.parser.xml.lido.core.leaf.roleInEvent.RoleInEvent;
import ro.webdata.parser.xml.lido.core.leaf.thingPresent.ThingPresent;
import ro.webdata.parser.xml.lido.core.set.eventDescriptionSet.EventDescriptionSet;
import ro.webdata.parser.xml.lido.core.set.relatedEventSet.RelatedEventSet;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Complex type for one event associated with the object / work
 * 		and its related information.<br/>
 * 		<b>How to record:</b> If there is more than one event repeat the Event Set element.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>eventID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique identifier for the event.<br/>
 * 				<b>How to record:</b> Preferably taken from and linking to a published resource describing the event.
 * 			</div>
 * 			<b>eventType (lido:conceptComplexType 1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The nature of the event associated with an object / work.<br/>
 * 				<b>How to record:</b> Controlled. Recommended: Defined list of subclasses of CRM entity E5 Event. Basic
 * 				event types as recorded in sub-element term include: Acquisition, Collecting, Commisioning, Creation,
 * 				Designing, Destruction, Event (non-specified), Excavation, Exhibition, Finding, Loss, Modification, Move,
 * 				Part addition, Part removal, Performance, Planning, Production, Provenance, Publication, Restoration,
 * 				Transformation, Type assignment, Type creation, Use.
 * 			</div>
 * 			<b>roleInEvent (lido:conceptComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The role played within this event by the described entity.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 			</div>
 * 			<b>eventName (lido:appellationComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> An appellation for the event, e.g. a title, identifying phrase, or name given to it.
 * 			</div>
 * 			<b>eventActor (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for display and index elements for an actor with role information (participating
 * 				or being present in the event).<br/>
 * 				<b>How to record:</b> For multiple actors repeat the element.
 * 			</div>
 * 			<b>culture (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Name of a culture, cultural context, people, or also a nationality.<br/>
 * 				<b>How to record:</b> Preferably using a controlled vocabuarly.
 * 			</div>
 * 			<b>eventDate (lido:dateSetComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Date specification of the event.
 * 			</div>
 * 			<b>periodName (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A period in which the event happened.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary. Repeat this
 * 				element only for indicating an earliest and latest period delimiting the event.<br/>
 * 				<b>Notes:</b> Period concepts have delimiting character in time and space.
 * 			</div>
 * 			<b>eventPlace (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Place specification of the event.
 * 			</div>
 * 			<b>eventMethod (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The method by which the event is carried out.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary.<br/>
 * 				<b>Notes:</b> Used e.g. for SPECTRUM Units of Information "field collection method",
 * 				"acquisition method".
 * 			</div>
 * 			<b>eventMaterialsTech (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Indicates the substances or materials used within the event (e.g.
 * 				the creation of an object / work), as well as any implements, production or manufacturing
 * 				techniques, processes, or methods incorporated.<br/>
 * 				<b>How to record:</b> Will be used most often within a production event, but also others
 * 				such as excavation, restoration, etc.
 * 			</div>
 * 			<b>thingPresent (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> References another object that was present at this same event.
 * 			</div>
 * 			<b>relatedEventSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> References an event which is linked in some way to this event, e.g.
 * 				a field trip within which this object was collected.
 * 			</div>
 * 			<b>eventDescriptionSet (lido:descriptiveNoteComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for a description of the event, including description identifier,
 * 				descriptive note of the event and its sources. <br/>
 * 				<b>How to record:</b> If there is more than one descriptive note, repeat this element.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventComplexType {
	private ArrayList<EventID> eventID;
	private EventType eventType;
	private ArrayList<RoleInEvent> roleInEvent;
	private ArrayList<EventName> eventName;
	private ArrayList<EventActor> eventActor;
	private ArrayList<Culture> culture;
	private EventDate eventDate;
	private ArrayList<PeriodName> periodName;
	private ArrayList<EventPlace> eventPlace;
	private ArrayList<EventMethod> eventMethod;
	private ArrayList<EventMaterialsTech> eventMaterialsTech;
	private ArrayList<ThingPresent> thingPresent;
	private ArrayList<RelatedEventSet> relatedEventSet;
	private ArrayList<EventDescriptionSet> eventDescriptionSet;
	private PrintMessages printMessages = new PrintMessages();

	public EventComplexType() {}

	public EventComplexType(ArrayList<EventID> eventID, EventType eventType, ArrayList<RoleInEvent> roleInEvent,
			ArrayList<EventName> eventName, ArrayList<EventActor> eventActor, ArrayList<Culture> culture, EventDate eventDate,
			ArrayList<PeriodName> periodName, ArrayList<EventPlace> eventPlace, ArrayList<EventMethod> eventMethod,
			ArrayList<EventMaterialsTech> eventMaterialsTech, ArrayList<ThingPresent> thingPresent,
			ArrayList<RelatedEventSet> relatedEventSet, ArrayList<EventDescriptionSet> eventDescriptionSet) {
		setCulture(culture);
		setEventActor(eventActor);
		setEventDate(eventDate);
		setEventDescriptionSet(eventDescriptionSet);
		setEventID(eventID);
		setEventMaterialsTech(eventMaterialsTech);
		setEventMethod(eventMethod);
		setEventName(eventName);
		setEventPlace(eventPlace);
		setEventType(eventType);
		setPeriodName(periodName);
		setRelatedEventSet(relatedEventSet);
		setRoleInEvent(roleInEvent);
		setThingPresent(thingPresent);

		if (eventType == null) {
			printMessages.printUndefinedNode(EventComplexType.class, "lido:eventType");
		}
	}

	public ArrayList<EventID> getEventID() {
		return eventID;
	}

	public void setEventID(ArrayList<EventID> eventID) {
		this.eventID = eventID;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public ArrayList<RoleInEvent> getRoleInEvent() {
		return roleInEvent;
	}

	public void setRoleInEvent(ArrayList<RoleInEvent> roleInEvent) {
		this.roleInEvent = roleInEvent;
	}

	public ArrayList<EventName> getEventName() {
		return eventName;
	}

	public void setEventName(ArrayList<EventName> eventName) {
		this.eventName = eventName;
	}

	public ArrayList<EventActor> getEventActor() {
		return eventActor;
	}

	public void setEventActor(ArrayList<EventActor> eventActor) {
		this.eventActor = eventActor;
	}

	public ArrayList<Culture> getCulture() {
		return culture;
	}

	public void setCulture(ArrayList<Culture> culture) {
		this.culture = culture;
	}

	public EventDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(EventDate eventDate) {
		this.eventDate = eventDate;
	}

	public ArrayList<PeriodName> getPeriodName() {
		return periodName;
	}

	public void setPeriodName(ArrayList<PeriodName> periodName) {
		this.periodName = periodName;
	}

	public ArrayList<EventPlace> getEventPlace() {
		return eventPlace;
	}

	public void setEventPlace(ArrayList<EventPlace> eventPlace) {
		this.eventPlace = eventPlace;
	}

	public ArrayList<EventMethod> getEventMethod() {
		return eventMethod;
	}

	public void setEventMethod(ArrayList<EventMethod> eventMethod) {
		this.eventMethod = eventMethod;
	}

	public ArrayList<EventMaterialsTech> getEventMaterialsTech() {
		return eventMaterialsTech;
	}

	public void setEventMaterialsTech(ArrayList<EventMaterialsTech> eventMaterialsTech) {
		this.eventMaterialsTech = eventMaterialsTech;
	}

	public ArrayList<ThingPresent> getThingPresent() {
		return thingPresent;
	}

	public void setThingPresent(ArrayList<ThingPresent> thingPresent) {
		this.thingPresent = thingPresent;
	}

	public ArrayList<RelatedEventSet> getRelatedEventSet() {
		return relatedEventSet;
	}

	public void setRelatedEventSet(ArrayList<RelatedEventSet> relatedEventSet) {
		this.relatedEventSet = relatedEventSet;
	}

	public ArrayList<EventDescriptionSet> getEventDescriptionSet() {
		return eventDescriptionSet;
	}

	public void setEventDescriptionSet(ArrayList<EventDescriptionSet> eventDescriptionSet) {
		this.eventDescriptionSet = eventDescriptionSet;
	}
}
