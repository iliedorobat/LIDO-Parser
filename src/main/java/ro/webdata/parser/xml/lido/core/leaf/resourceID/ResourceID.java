package ro.webdata.parser.xml.lido.core.leaf.resourceID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The unique numeric or alphanumeric identification of the
 * 			original (digital or analogue) resource.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceID extends IdentifierComplexType {
	public ResourceID() {}

	public ResourceID(IdentifierComplexType identifierComplexType) {
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
