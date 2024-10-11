package ro.webdata.parser.xml.lido.core.leaf.measurementType;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Indicates what kind of measurement is taken.<br/>
 * 		<b>How to record:</b> Data values for type: height, width, depth, length, diameter,
 * 		circumference, stories, count, area, volume, running time, size.Repeat this element
 * 		only for language variants.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MeasurementType extends TextComplexType {
	public MeasurementType() {}

	public MeasurementType(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
