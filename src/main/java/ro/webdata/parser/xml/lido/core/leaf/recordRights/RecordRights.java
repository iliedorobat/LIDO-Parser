package ro.webdata.parser.xml.lido.core.leaf.recordRights;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Information about rights regarding
 * 		the content provided in this LIDO record.<br/>
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
public class RecordRights extends RightsComplexType {
	private LidoSortOrder sortOrder;

	public RecordRights() {}

	public RecordRights(RightsComplexType rightsComplexType, LidoSortOrder sortOrder) {
		super(
			rightsComplexType.getRightsType(),
			rightsComplexType.getRightsDate(),
			rightsComplexType.getRightsHolder(),
			rightsComplexType.getCreditLine()
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
