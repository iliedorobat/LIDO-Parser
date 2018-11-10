package app.java.parser.model.element.leaf.resource;

import app.java.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The specific vantage point or perspective of the view.
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class ResourcePerspective extends ConceptComplexType {
	public ResourcePerspective() {}

	public ResourcePerspective(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}