package ro.webdata.parser.xml.lido.core.leaf.extentMeasurements;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> An explanation of the part of the object / work being measured
 * 		included, when necessary, for clarity.<br/>
 * 		<b>How to record:</b> Example values: overall, components, sheet, plate mark, chain
 * 		lines, pattern repeat, lid, base, laid lines, folios, leaves, columns per page, lines
 * 		per page, tessera, footprint, panel, interior, mat, window of mat, secondary support,
 * 		frame, and mount.<br/>
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
public class ExtentMeasurements extends TextComplexType {
	private LidoSortOrder sortOrder;

	public ExtentMeasurements() {}

	public ExtentMeasurements(TextComplexType textComplexType, LidoSortOrder sortOrder) {
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
