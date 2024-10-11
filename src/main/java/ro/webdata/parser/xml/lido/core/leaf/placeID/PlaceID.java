package ro.webdata.parser.xml.lido.core.leaf.placeID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A unique identifier for the place.<br/>
 * 			<b>How to record:</b> Preferably taken from a published authority file.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class PlaceID extends IdentifierComplexType {
	public PlaceID() {}

	public PlaceID(IdentifierComplexType identifierComplexType) {
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
