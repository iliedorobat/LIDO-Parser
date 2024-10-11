package ro.webdata.parser.xml.lido.core.leaf.subjectPlace;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A place depicted in or by an object / work, or what
 * 			it is about, provided as display and index elements.<br/>
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
public class SubjectPlace extends PlaceSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectPlace() {}

	public SubjectPlace(PlaceSetComplexType placeSetComplexType, LidoSortOrder sortOrder) {
		super(
			placeSetComplexType.getDisplayPlace(),
			placeSetComplexType.getPlace()
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
