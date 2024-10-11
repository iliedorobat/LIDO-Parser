package ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The published source of the state or edition information.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SourceStateEdition extends TextComplexType {
	public SourceStateEdition() {}

	public SourceStateEdition(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
