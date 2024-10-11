package ro.webdata.parser.xml.lido.core.leaf.qualifierMeasurements;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A word or phrase that elaborates on the nature of the measurements
 * 		of the object / work when necessary, e.g. when the measurements are approximate.<br/>
 * 		<b>How to record:</b> Example values: approximate, sight, maximum, larges, smallest,
 * 		average, variable, assembled, before restoration, before restoration, at corners,
 * 		rounded, framed, and with base.<br/>
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
public class QualifierMeasurements extends TextComplexType {
	private LidoSortOrder sortOrder;

	public QualifierMeasurements() {}

	public QualifierMeasurements(TextComplexType textComplexType, LidoSortOrder sortOrder) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
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
