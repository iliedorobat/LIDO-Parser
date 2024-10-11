package ro.webdata.parser.xml.lido.core.leaf.rightsType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> he specific type of right being recorded.<br/>
 * 			<b>How to record:</b> For example: copyright, publication right, data protection right,
 * 			trademark.Preferably taken from a published controlled value list.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsType extends ConceptComplexType {
	public RightsType() {}

	public RightsType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
