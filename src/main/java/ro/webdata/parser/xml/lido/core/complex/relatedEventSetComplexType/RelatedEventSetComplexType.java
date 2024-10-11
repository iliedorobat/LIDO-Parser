package ro.webdata.parser.xml.lido.core.complex.relatedEventSetComplexType;

import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexType;
import ro.webdata.parser.xml.lido.core.leaf.relatedEventRelType.RelatedEventRelType;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for one event related to the described event.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>relatedEvent (lido:eventSetComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display and index elements for the event related to the event being recorded.
 * 			</div>
 * 			<b>relatedEventRelType (lido:conceptComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A term describing the nature of the relationship between the described event
 * 				and the related event.<br/>
 * 				<b>How to record:</b> Example values: part of, influence of, related to.Indicate a term
 * 				characterizing the relationship from the perspective of the currently described event towards
 * 				the related event. Preferably taken from a published controlled vocabulary.<br/>
 * 				<b>Notes:</b> For implementation of the data, note that relationships are conceptually reciprocal,
 * 				but the Relationship Type is often different on either side of the relationship.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedEventSetComplexType {
	private EventSetComplexType relatedEvent;
	private RelatedEventRelType relatedEventRelType;

	public RelatedEventSetComplexType() {}

	public RelatedEventSetComplexType(EventSetComplexType relatedEvent, RelatedEventRelType relatedEventRelType) {
		setRelatedEvent(relatedEvent);
		setRelatedEventRelType(relatedEventRelType);
	}

	public EventSetComplexType getRelatedEvent() {
		return relatedEvent;
	}

	public void setRelatedEvent(EventSetComplexType relatedEvent) {
		this.relatedEvent = relatedEvent;
	}

	public RelatedEventRelType getRelatedEventRelType() {
		return relatedEventRelType;
	}

	public void setRelatedEventRelType(RelatedEventRelType relatedEventRelType) {
		this.relatedEventRelType = relatedEventRelType;
	}
}
