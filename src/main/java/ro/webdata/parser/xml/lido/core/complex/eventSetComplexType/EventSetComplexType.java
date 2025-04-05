package ro.webdata.parser.xml.lido.core.complex.eventSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.displayEvent.DisplayEvent;
import ro.webdata.parser.xml.lido.core.leaf.event.Event;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for events (e.g. creation, find, use etc.),
 * 		in which the described object participated.<br/>
 * 		<b>How to record:</b> For multiple events repeat the element.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayEvent (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for an event, corresponding to the following event element.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>event (lido:eventComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Identifying, descriptive and indexing information for the events in which
 * 				the object participated or was present at, e.g. creation, excavation, collection, and use.<br/>
 * 				<b>Notes:</b> All information related to the creation of an object: creator, cutlural context,
 * 				creation date, creation place, the material and techniques used are recorded here, qualified
 * 				by the event type "creation".
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventSetComplexType {
	private List<DisplayEvent> displayEvent;
	private Event event;

	public EventSetComplexType() {}

	public EventSetComplexType(List<DisplayEvent> displayEvent, Event event) {
		setDisplayEvent(displayEvent);
		setEvent(event);
	}

	public List<DisplayEvent> getDisplayEvent() {
		return displayEvent;
	}

	public void setDisplayEvent(List<DisplayEvent> displayEvent) {
		this.displayEvent = displayEvent;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
