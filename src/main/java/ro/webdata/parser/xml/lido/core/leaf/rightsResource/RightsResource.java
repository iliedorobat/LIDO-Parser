package ro.webdata.parser.xml.lido.core.leaf.rightsResource;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Information about rights regarding the image or other resource.<br/>
 * 			<b>How to record:</b> Use this sub-element if the holder of the reproduction rights for
 * 			the image/resource differs from the holder of rights for the work. See also Rights Work
 * 			above. (E.g., the work rights are " National Museum of African Art, Smithsonian Instituition
 * 			(Washing DC), " but the image rights are "Photo Frank Khoury.")<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsResource extends RightsComplexType {
	private LidoSortOrder sortOrder;

	public RightsResource() {}

	public RightsResource(RightsComplexType rightsComplexType, LidoSortOrder sortOrder) {
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
