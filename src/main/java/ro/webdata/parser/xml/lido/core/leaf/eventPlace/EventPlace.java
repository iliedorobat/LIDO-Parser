package ro.webdata.parser.xml.lido.core.leaf.eventPlace;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Place specification of the event.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b>
 * 				<div class="lido-attr-doc">
 * 					<b>How to record:</b> Data values may be: moveFrom, moveTo, alternative.
 * 				</div>
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventPlace extends PlaceSetComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public EventPlace() {}

	public EventPlace(PlaceSetComplexType placeSetComplexType, LidoType type, LidoSortOrder sortOrder) {
		super(
			placeSetComplexType.getDisplayPlace(),
			placeSetComplexType.getPlace()
		);
		setType(type);
		setSortOrder(sortOrder);
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
