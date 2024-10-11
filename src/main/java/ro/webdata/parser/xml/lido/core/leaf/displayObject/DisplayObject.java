package ro.webdata.parser.xml.lido.core.leaf.displayObject;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A free-text description of the object, corresponding to the
 * 			following object element<br/>
 * 			<b>How to record:</b> Contains identifying information and links to another object.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayObject extends TextComplexType {
	public DisplayObject() {}

	public DisplayObject(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
