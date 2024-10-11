package ro.webdata.parser.xml.lido.core.set.resourceMeasurementsSet;

import ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType.MeasurementsSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Any technical measurement information needed for online
 * 		presentation of the resource.<br/>
 * 		<b>How to record:</b> For images provide width and height of the digital
 * 		image, for audio or video resources provide duration, bit rate, frame size,
 * 		and if necessary TC-IN, TC-OUT.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceMeasurementsSet extends MeasurementsSetComplexType {
	public ResourceMeasurementsSet() {}

	public ResourceMeasurementsSet(MeasurementsSetComplexType measurementsSetComplexType) {
		super(
			measurementsSetComplexType.getMeasurementType(),
			measurementsSetComplexType.getMeasurementUnit(),
			measurementsSetComplexType.getMeasurementValue()
		);
	}
}
