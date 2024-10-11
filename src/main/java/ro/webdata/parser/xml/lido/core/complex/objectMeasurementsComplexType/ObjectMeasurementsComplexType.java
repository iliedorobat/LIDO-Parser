package ro.webdata.parser.xml.lido.core.complex.objectMeasurementsComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.extentMeasurements.ExtentMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.formatMeasurements.FormatMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.qualifierMeasurements.QualifierMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.scaleMeasurements.ScaleMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.shapeMeasurements.ShapeMeasurements;
import ro.webdata.parser.xml.lido.core.set.measurementsSet.MeasurementsSet;

/**
 * <link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The dimensions, size, shape, scale, format, or storage configuration of the
 * 		object / work, including volume, weight, area or running time.<br/>
 * 		<b>How to record:</b> Measurements are formatted to allow retrieval; preferably in metric units
 * 		where applicable.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>measurementsSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The dimensions or other measurements for one aspect of an object / work
 * 				(e.g., width).<br/>
 * 				<b>How to record:</b> May be combined with extent, qualifier, and other sub-elements as necessary.
 * 				The subelements "measurementUnit", "measurementValue" and "measurementType" are mandatory.
 * 			</div>
 * 			<b>extentMeasurements (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> An explanation of the part of the object / work being measured included,
 * 				when necessary, for clarity.<br/>
 * 				<b>How to record:</b> Example values: overall, components, sheet, plate mark, chain lines,
 * 				pattern repeat, lid, base, laid lines, folios, leaves, columns per page, lines per page, tessera,
 * 				footprint, panel, interior, mat, window of mat, secondary support, frame, and mount
 * 			</div>
 * 			<b>qualifierMeasurements (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A word or phrase that elaborates on the nature of the measurements of the
 * 				object / work when necessary, e.g. when the measurements are approximate.<br/>
 * 				<b>How to record:</b> Example values: approximate, sight, maximum, larges, smallest, average,
 * 				variable, assembled, before restoration, before restoration, at corners, rounded, framed, and
 * 				with base.
 * 			</div>
 * 			<b>formatMeasurements (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The configuration of an object / work, including technical formats. Used as
 * 				necessary.<br/>
 * 				<b>How to record:</b> Example values: Vignette, VHS, IMAX, and DOS
 * 			</div>
 * 			<b>shapeMeasurements (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The shape of an object / work. Used for unusual shapes (e.g., an oval painting).<br/>
 * 				<b>How to record:</b> Example values: oval, round, square, rectangular, and irregular.
 * 			</div>
 * 			<b>scaleMeasurements (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> An expression of the ratio between the size of the representation of something and
 * 				that thing (e.g., the size of the drawn structure and the actual built work). <br/>
 * 				<b>How to record:</b> Example values for scale: numeric (e.g., 1 inch = 1 foot), full-size, life-size,
 * 				half size ,monumental and others as recommended in CCO and CDWA. Combine this tag with Measurement Sets
 * 				for numeric scales. For measurementsSet type for Scale, use "base" for the left side of the equation, and
 * 				"target" for the right side of the equation).<br/>
 * 				<b>Notes:</b> Used for studies, record drawings, models, and other representations drawn or constructed to scale.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectMeasurementsComplexType {
	private ArrayList<MeasurementsSet> measurementsSet;
	private ArrayList<ExtentMeasurements> extentMeasurements;
	private ArrayList<QualifierMeasurements> qualifierMeasurements;
	private ArrayList<FormatMeasurements> formatMeasurements;
	private ArrayList<ShapeMeasurements> shapeMeasurements;
	private ArrayList<ScaleMeasurements> scaleMeasurements;

	public ObjectMeasurementsComplexType() {}

	public ObjectMeasurementsComplexType(ArrayList<MeasurementsSet> measurementsSet, ArrayList<ExtentMeasurements> extentMeasurements,
			ArrayList<QualifierMeasurements> qualifierMeasurements, ArrayList<FormatMeasurements> formatMeasurements,
			ArrayList<ShapeMeasurements> shapeMeasurements, ArrayList<ScaleMeasurements> scaleMeasurements) {
		setMeasurementsSet(measurementsSet);
		setExtentMeasurements(extentMeasurements);
		setQualifierMeasurements(qualifierMeasurements);
		setFormatMeasurements(formatMeasurements);
		setShapeMeasurements(shapeMeasurements);
		setScaleMeasurements(scaleMeasurements);
	}

	public ArrayList<MeasurementsSet> getMeasurementsSet() {
		return measurementsSet;
	}

	public void setMeasurementsSet(ArrayList<MeasurementsSet> measurementsSet) {
		this.measurementsSet = measurementsSet;
	}

	public ArrayList<ExtentMeasurements> getExtentMeasurements() {
		return extentMeasurements;
	}

	public void setExtentMeasurements(ArrayList<ExtentMeasurements> extentMeasurements) {
		this.extentMeasurements = extentMeasurements;
	}

	public ArrayList<QualifierMeasurements> getQualifierMeasurements() {
		return qualifierMeasurements;
	}

	public void setQualifierMeasurements(ArrayList<QualifierMeasurements> qualifierMeasurements) {
		this.qualifierMeasurements = qualifierMeasurements;
	}

	public ArrayList<FormatMeasurements> getFormatMeasurements() {
		return formatMeasurements;
	}

	public void setFormatMeasurements(ArrayList<FormatMeasurements> formatMeasurements) {
		this.formatMeasurements = formatMeasurements;
	}

	public ArrayList<ShapeMeasurements> getShapeMeasurements() {
		return shapeMeasurements;
	}

	public void setShapeMeasurements(ArrayList<ShapeMeasurements> shapeMeasurements) {
		this.shapeMeasurements = shapeMeasurements;
	}

	public ArrayList<ScaleMeasurements> getScaleMeasurements() {
		return scaleMeasurements;
	}

	public void setScaleMeasurements(ArrayList<ScaleMeasurements> scaleMeasurements) {
		this.scaleMeasurements = scaleMeasurements;
	}
}
