package ro.webdata.parser.xml.lido.core.leaf.eventID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A unique identifier for the event.<br/>
 * 			<b>How to record:</b> Preferably taken from and linking to a published resource
 * 			describing the event.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventID extends IdentifierComplexType {
	public EventID() {}

	public EventID(IdentifierComplexType identifierComplexType) {
		super(
			identifierComplexType.getText(),
			identifierComplexType.getPref(),
			identifierComplexType.getType(),
			identifierComplexType.getSource(),
			identifierComplexType.getEncodingAnalog(),
			identifierComplexType.getLabel()
		);
	}
}
