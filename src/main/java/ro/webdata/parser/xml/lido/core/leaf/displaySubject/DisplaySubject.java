package ro.webdata.parser.xml.lido.core.leaf.displaySubject;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A free-text description of the subject matter represented
 * 			by/in the object / work, corresponding to the following subject element<br/>
 * 			<b>How to record:</b> Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplaySubject extends TextComplexType {
	public DisplaySubject() {}

	public DisplaySubject(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
