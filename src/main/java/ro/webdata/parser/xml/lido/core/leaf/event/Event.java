package ro.webdata.parser.xml.lido.core.leaf.event;

import ro.webdata.parser.xml.lido.core.complex.eventComplexType.EventComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Identifying, descriptive and indexing information
 * 			for the events in which the object participated or was present at, e.g.
 * 			creation, excavation, collection, and use.<br/>
 * 			<b>Note:</b>All information related to the creation of an object:
 * 			creator, cutlural context, creation date, creation place, the material
 * 			and techniques used are recorded here, qualified by the event type
 * 			"creation".
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Event extends EventComplexType {
	public Event() {}

	public Event(EventComplexType eventComplexType) {
		super(
			eventComplexType.getEventID(),
			eventComplexType.getEventType(),
			eventComplexType.getRoleInEvent(),
			eventComplexType.getEventName(),
			eventComplexType.getEventActor(),
			eventComplexType.getCulture(),
			eventComplexType.getEventDate(),
			eventComplexType.getPeriodName(),
			eventComplexType.getEventPlace(),
			eventComplexType.getEventMethod(),
			eventComplexType.getEventMaterialsTech(),
			eventComplexType.getThingPresent(),
			eventComplexType.getRelatedEventSet(),
			eventComplexType.getEventDescriptionSet()
		);
	}
}
