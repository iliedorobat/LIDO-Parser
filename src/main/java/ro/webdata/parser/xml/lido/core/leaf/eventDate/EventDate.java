package ro.webdata.parser.xml.lido.core.leaf.eventDate;

import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Date specification of the event.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventDate extends DateSetComplexType {
	public EventDate() {}

	public EventDate(DateSetComplexType dateSetComplexType) {
		super(
			dateSetComplexType.getDisplayDate(),
			dateSetComplexType.getDate()
		);
	}
}
