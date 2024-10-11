package ro.webdata.parser.xml.lido.core.leaf.legalBodyID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Unambiguous identification of the institution or person referred to as legal body.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LegalBodyID extends IdentifierComplexType {
	public LegalBodyID() {}

	public LegalBodyID(IdentifierComplexType identifierComplexType) {
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
