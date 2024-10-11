package ro.webdata.parser.xml.lido.core.set.measurementsSet;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType.MeasurementsSetComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The dimensions or other measurements for one aspect
 * 		of an object / work (e.g., width).<br/>
 * 		<b>How to record:</b> May be combined with extent, qualifier, and other
 * 		sub-elements as necessary.The subelements "measurementUnit", "measurementValue"
 * 		and "measurementType" are mandatory.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MeasurementsSet extends MeasurementsSetComplexType {
	private LidoSortOrder sortOrder;

	public MeasurementsSet() {}

	public MeasurementsSet(MeasurementsSetComplexType measurementsSetComplexType, LidoSortOrder sortOrder) {
		super(
			measurementsSetComplexType.getMeasurementType(),
			measurementsSetComplexType.getMeasurementUnit(),
			measurementsSetComplexType.getMeasurementValue()
		);
		setSortOrder(sortOrder);
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
