package ro.webdata.parser.xml.lido.core.set.eventSet;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for the display and index elements for events (e.g. creation,
 * 		find, and use), in which the object participated.<br/>
 * 		<b>How to record:</b> For multiple events repeat the element.<br/>
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
public class EventSet extends EventSetComplexType {
	private LidoSortOrder sortOrder;

	public EventSet() {}

	public EventSet(EventSetComplexType eventSetComplexType, LidoSortOrder sortOrder) {
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
