package ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A qualifier used when the attribution is uncertain, is in dispute,
 * 			when there is more than one actor, when there is a former attribution, or when the
 * 			attribution otherwise requires explanation.<br/>
 * 			<b>How to record:</b> Example values: attributed to, studio of, workshop of, atelier
 * 			of, office of, assistant of, associate of, pupil of, follower of, school of, circle
 * 			of, style of, after copyist of, manner of...
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class AttributionQualifierActor extends TextComplexType {
	public AttributionQualifierActor() {}

	public AttributionQualifierActor(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
