package ro.webdata.parser.xml.lido.core.leaf.displayEdition;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A description of the edition of the object / work. Used primarily
 * 			for prints and other multiples.<br/>
 * 			<b>How to record:</b> Formulated according to rules. For Edition, include impression
 * 			number, edition size, and edition number, or edition name, as appropriate.Repeat this
 * 			element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayEdition extends TextComplexType {
	public DisplayEdition() {}

	public DisplayEdition(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
