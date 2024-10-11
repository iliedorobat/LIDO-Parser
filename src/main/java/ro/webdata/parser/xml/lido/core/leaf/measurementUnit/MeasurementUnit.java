package ro.webdata.parser.xml.lido.core.leaf.measurementUnit;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The unit of the measurement.<br/>
 * 		<b>How to record:</b> E.g. cm, mm, m, g, kg, kb, Mb or Gb.Repeat this element only for language variants.

 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MeasurementUnit extends TextComplexType {
	public MeasurementUnit() {}

	public MeasurementUnit(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
