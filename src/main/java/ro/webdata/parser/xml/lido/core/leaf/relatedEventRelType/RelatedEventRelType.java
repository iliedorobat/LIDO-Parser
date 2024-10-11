package ro.webdata.parser.xml.lido.core.leaf.relatedEventRelType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A term describing the nature of the relationship between the
 * 			described event and the related event.<br/>
 * 			<b>How to record:</b> Example values: part of, influence of, related to.Indicate
 * 			a term characterizing the relationship from the perspective of the currently
 * 			described event towards the related event. Preferably taken from a published
 * 			controlled vocabulary.<br/>
 * 			<b>Notes:</b> For implementation of the data, note that relationships are conceptually
 * 			reciprocal, but the Relationship Type is often different on either side of the relationship.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedEventRelType extends ConceptComplexType {
	public RelatedEventRelType() {}

	public RelatedEventRelType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
