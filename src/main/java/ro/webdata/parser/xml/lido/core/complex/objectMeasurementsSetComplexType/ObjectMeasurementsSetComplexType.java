package ro.webdata.parser.xml.lido.core.complex.objectMeasurementsSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsComplexType.ObjectMeasurementsComplexType;
import ro.webdata.parser.xml.lido.core.leaf.displayObjectMeasurements.DisplayObjectMeasurements;

/**
 * <link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for object measurements. If multiple parts
 * 		of the object / work are measured, repeat the element<br/>
 * 		<b>How to record:</b> Holds information about the dimensions, size, or scale of the object / work.
 * 		It may also include the number of parts in a complex object / work, series, or collection.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayObjectMeasurements (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for one object measurement, corresponding to the
 * 				following objectMeasurement element.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>objectMeasurements (lido:objectMeasurementsComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Structured measurement information about the dimensions, size, or
 * 				scale of the object / work. <br/>
 * 				<b>Notes:</b> It may also include the parts of a complex object / work, series, or collection.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectMeasurementsSetComplexType {
	private ArrayList<DisplayObjectMeasurements> displayObjectMeasurements;
	private ObjectMeasurementsComplexType objectMeasurements;

	public ObjectMeasurementsSetComplexType() {}

	public ObjectMeasurementsSetComplexType(ArrayList<DisplayObjectMeasurements> displayObjectMeasurements,
			ObjectMeasurementsComplexType objectMeasurements) {
		setDisplayObjectMeasurements(displayObjectMeasurements);
		setObjectMeasurements(objectMeasurements);
	}

	public ArrayList<DisplayObjectMeasurements> getDisplayObjectMeasurements() {
		return displayObjectMeasurements;
	}

	public void setDisplayObjectMeasurements(ArrayList<DisplayObjectMeasurements> displayObjectMeasurements) {
		this.displayObjectMeasurements = displayObjectMeasurements;
	}

	public ObjectMeasurementsComplexType getObjectMeasurements() {
		return objectMeasurements;
	}

	public void setObjectMeasurements(ObjectMeasurementsComplexType objectMeasurements) {
		this.objectMeasurements = objectMeasurements;
	}
}
