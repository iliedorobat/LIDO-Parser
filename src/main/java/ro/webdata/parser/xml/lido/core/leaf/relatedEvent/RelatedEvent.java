package ro.webdata.parser.xml.lido.core.leaf.relatedEvent;

import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Display and index elements for the event related to the event being recorded.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedEvent extends EventSetComplexType {
	public RelatedEvent() {}

	public RelatedEvent(EventSetComplexType eventSetComplexType) {
		super(
			eventSetComplexType.getDisplayEvent(),
			eventSetComplexType.getEvent()
		);
	}
}
