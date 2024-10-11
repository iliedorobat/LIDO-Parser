package ro.webdata.parser.xml.lido.core.leaf.relatedWorkRelType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A term describing the nature of the relationship between the
 * 			object /work at hand and the related entity.<br/>
 * 			<b>How to record:</b> Example values: part of, larger context for, model of, model
 * 			for, study of, study forrendering of, copy of, related to.Indicate a term characterizing
 * 			the relationship from the perspective of the currently described object / work towards
 * 			the related object / work.<br/>
 * 			<b>Notes:</b> For implementation of the data, note that relationships are conceptually
 * 			reciprocal, but the Relationship Type is often different on either side of the relationship
 * 			(e.g., one work is part of a second work, but from the point of view of the second record,
 * 			the first work is the larger context for the second work). Whether or not relationships are
 * 			physically reciprocal as implemented in systems is a local decision.
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedWorkRelType extends ConceptComplexType {
	public RelatedWorkRelType() {}

	public RelatedWorkRelType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
