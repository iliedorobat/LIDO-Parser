package ro.webdata.parser.xml.lido.core.leaf.extentActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Extent of the actor's participation in the event, if there are
 * 			several actors.<br/>
 * 			<b>How to record:</b> Example values: design, execution, with additions by, figures,
 * 			renovation by, predella, embroidery, cast by, printed by, ...
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ExtentActor extends TextComplexType {
	public ExtentActor() {}

	public ExtentActor(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
