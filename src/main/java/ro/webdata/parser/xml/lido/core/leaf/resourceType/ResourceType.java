package ro.webdata.parser.xml.lido.core.leaf.resourceType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The generic identification of the medium of the image or
 * 			other resource.<br/>
 * 			<b>How to record:</b> Preferably using a controlled published value list.
 * 			Example values: digital image, photograph, slide, videotape, X-ray photograph,
 * 			negative.
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceType extends ConceptComplexType {
	public ResourceType() {}

	public ResourceType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
