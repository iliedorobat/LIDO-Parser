package ro.webdata.parser.xml.lido.core.leaf.displayState;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A description of the state of the object / work. Used primarily
 * 			for prints and other multiples<br/>
 * 			<b>How to record:</b> Formulated according to rules. For State, include state identification
 * 			and known states, as appropriate.Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayState extends TextComplexType {
	public DisplayState() {}

	public DisplayState(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
