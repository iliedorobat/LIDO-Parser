package ro.webdata.parser.xml.lido.core.leaf.eventName;

import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> An appellation for the event, e.g. a title, identifying phrase,
 * 		or name given to it.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventName extends AppellationComplexType {
	public EventName() {}

	public EventName(AppellationComplexType appellationComplexType) {
		super(
			appellationComplexType.getAppellationValue(),
			appellationComplexType.getSourceAppellation()
		);
	}
}
