package ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.relatedWork.RelatedWork;
import ro.webdata.parser.xml.lido.core.leaf.relatedWorkRelType.RelatedWorkRelType;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for one object / work, group, collection, or series that is directly
 * 		related to the object / work at hand, including direct relationships between the two, between an
 * 		object / work and its components, and between an item and the larger group, collection, or series.<br/>
 * 		<b>How to record:</b> If there is more than one object / work referred to then the set should be repeated.
 * 		Preferably taken from a published controlled vocabulary.<br/>
 * 		<b>Notes:</b> Objects referred to may be corresponding object / works or those created to be shown
 * 		together with the object / work in question, but also e.g., literature (bibliographic objects) in
 * 		which the object / work is documented or mentioned forms a "relatedWorkSet".<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>relatedWork (lido:objectSetComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for the display and reference elements of a related object / work.
 * 			</div>
 * 			<b>relatedWorkRelType (lido:conceptComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A term describing the nature of the relationship between the object / work
 * 				at hand and the related entity.<br/>
 * 				<b>How to record:</b> Example values: part of, larger context for, model of, model for, study of,
 * 				study forrendering of, copy of, related to.Indicate a term characterizing the relationship from
 * 				the perspective of the currently described object / work towards the related object / work.<br/>
 * 				<b>Notes:</b> For implementation of the data, note that relationships are conceptually reciprocal,
 * 				but the Relationship Type is often different on either side of the relationship (e.g., one work is
 * 				part of a second work, but from the point of view of the second record, the first work is the larger
 * 				context for the second work). Whether or not relationships are physically reciprocal as implemented
 * 				in systems is a local decision.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedWorkSetComplexType {
	private RelatedWork relatedWork;
	private RelatedWorkRelType relatedWorkRelType;

	public RelatedWorkSetComplexType() {}

	public RelatedWorkSetComplexType(RelatedWork relatedWork, RelatedWorkRelType relatedWorkRelType) {
		setRelatedWork(relatedWork);
		setRelatedWorkRelType(relatedWorkRelType);
	}

	public RelatedWork getRelatedWork() {
		return relatedWork;
	}

	public void setRelatedWork(RelatedWork relatedWork) {
		this.relatedWork = relatedWork;
	}

	public RelatedWorkRelType getRelatedWorkRelType() {
		return relatedWorkRelType;
	}

	public void setRelatedWorkRelType(RelatedWorkRelType relatedWorkRelType) {
		this.relatedWorkRelType = relatedWorkRelType;
	}
}
