package ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.measurementType.MeasurementType;
import ro.webdata.parser.xml.lido.core.leaf.measurementUnit.MeasurementUnit;
import ro.webdata.parser.xml.lido.core.leaf.measurementValue.MeasurementValue;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**
 * <link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The dimensions or other measurements for one aspect of the item.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>measurementType (lido:textComplexType 1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Indicates what kind of measurement is taken.<br/>
 * 				<b>How to record:</b> Data values for type: height, width, depth, length,
 * 				diameter, circumference, stories, count, area, volume, running time, size.
 * 				Repeat this element only for language variants.
 * 			</div>
 * 			<b>measurementUnit (lido:textComplexType 1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The unit of the measurement.<br/>
 * 				<b>How to record:</b> E.g. cm, mm, m, g, kg, kb, Mb or Gb.Repeat this element only for language variants.
 * 			</div>
 * 			<b>measurementValue (lido:textComplexType 1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The value of the measurement.<br/>
 * 				<b>How to record:</b> Whole numbers or decimal fractions.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MeasurementsSetComplexType {
	private ArrayList<MeasurementType> measurementType;
	private ArrayList<MeasurementUnit> measurementUnit;
	private MeasurementValue measurementValue;
	private PrintMessages printMessages = new PrintMessages();

	public MeasurementsSetComplexType() {}

	public MeasurementsSetComplexType(ArrayList<MeasurementType> measurementType,
			ArrayList<MeasurementUnit> measurementUnit, MeasurementValue measurementValue) {
		setMeasurementType(measurementType);
		setMeasurementUnit(measurementUnit);
		setMeasurementValue(measurementValue);

		if (measurementType == null || measurementType.isEmpty()) {
			printMessages.printEmptyArray(MeasurementsSetComplexType.class, "lido:measurementType");
		}

		if (measurementUnit == null || measurementUnit.isEmpty()) {
			printMessages.printEmptyArray(MeasurementsSetComplexType.class, "lido:measurementUnit");
		}

		if (measurementValue == null) {
			printMessages.printUndefinedNode(MeasurementsSetComplexType.class, "lido:measurementValue");
		}
	}

	public ArrayList<MeasurementType> getMeasurementType() {
		return measurementType;
	}

	public void setMeasurementType(ArrayList<MeasurementType> measurementType) {
		this.measurementType = measurementType;
	}

	public ArrayList<MeasurementUnit> getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(ArrayList<MeasurementUnit> measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public MeasurementValue getMeasurementValue() {
		return measurementValue;
	}

	public void setMeasurementValue(MeasurementValue measurementValue) {
		this.measurementValue = measurementValue;
	}
}
