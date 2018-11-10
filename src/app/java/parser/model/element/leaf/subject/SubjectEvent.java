package app.java.parser.model.element.leaf.subject;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.event.EventSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> An event depicted in or by an object / work, or what it is about,
 * 			provided as display and index elements.<br/>
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
public class SubjectEvent extends EventSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectEvent() {}

	public SubjectEvent(EventSetComplexType eventSetComplexType, LidoSortOrder sortOrder) {
		super(
			eventSetComplexType.getDisplayEvent(),
			eventSetComplexType.getEvent()
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