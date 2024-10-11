package ro.webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The source for the descriptive note, generally a published source.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SourceDescriptiveNote extends TextComplexType {
	public SourceDescriptiveNote() {}

	public SourceDescriptiveNote(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
