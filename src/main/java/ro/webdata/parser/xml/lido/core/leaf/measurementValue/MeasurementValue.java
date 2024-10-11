package ro.webdata.parser.xml.lido.core.leaf.measurementValue;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The value of the measurement.<br/>
 * 		<b>How to record:</b> Whole numbers or decimal fractions.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MeasurementValue extends TextComplexType {
	public MeasurementValue() {}

	public MeasurementValue(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
