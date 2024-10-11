package ro.webdata.parser.xml.lido.core.leaf.eventType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The nature of the event associated with an object / work.<br/>
 * 			<b>How to record:</b> Controlled. Recommended: Defined list of subclasses of CRM
 * 			entity E5 Event.Basic event types as recorded in sub-element term include: Acquisition,
 * 			Collecting, Commisioning, Creation, Designing, Destruction, Event (non-specified),
 * 			Excavation, Exhibition, Finding, Loss, Modification, Move, Part addition, Part removal,
 * 			Performance, Planning, Production, Provenance, Publication, Restoration, Transformation,
 * 			Type assignment, Type creation, Use.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventType extends ConceptComplexType {
	public EventType() {}

	public EventType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
