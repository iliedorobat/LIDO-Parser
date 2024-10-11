package ro.webdata.parser.xml.lido.core.leaf.resourcePerspective;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

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
