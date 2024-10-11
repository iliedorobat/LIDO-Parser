package ro.webdata.parser.xml.lido.core.leaf.displayEvent;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Display element for an event, corresponding to the following event element.<br/>
 * 		<b>How to record:</b> Repeat this element only for language variants.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayEvent extends TextComplexType {
	public DisplayEvent() {}

	public DisplayEvent(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
