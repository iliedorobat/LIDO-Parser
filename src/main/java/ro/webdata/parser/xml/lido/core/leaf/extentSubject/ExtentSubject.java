package ro.webdata.parser.xml.lido.core.leaf.extentSubject;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> When there are multiple subjects, a term indicating
 * 			the part of the object / work to which these subject terms apply.<br/>
 *			<b>How to record:</b> Example values: recto, verso, side A, side B, main
 *			panel, and predella.Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ExtentSubject extends TextComplexType {
	public ExtentSubject() {}

	public ExtentSubject(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
