package ro.webdata.parser.xml.lido.core.leaf.genderActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The sex of the individual.<br/>
 * 			<b>How to record:</b> Data values: male, female, unknown, not applicable.
 * 			Repeat this element for language variants only.<br/>
 * 			<b>Notes:</b> Not applicable for corporate bodies.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class GenderActor extends TextComplexType {
	public GenderActor() {}

	public GenderActor(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
