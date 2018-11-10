package app.java.parser.model.element.leaf.date;

import app.java.parser.model.complex.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Display element for a date specification, corresponding to the
 * 			following date element.<br/>
 * 			<b>How to record:</b> It is a concise description of the date, presented in a syntax
 * 			suitable for display to the end-user and including any necessary indications of uncertainty,
 * 			ambiguity, and nuance.Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayDate extends TextComplexType {
	public DisplayDate() {}

	public DisplayDate(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}