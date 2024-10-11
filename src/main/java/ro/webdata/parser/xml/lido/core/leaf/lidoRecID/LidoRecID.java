package ro.webdata.parser.xml.lido.core.leaf.lidoRecID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A unique lido record identification preferably composed of an
 * 			identifier for the contributor and a record identification in the contributor's
 * 			(local) system.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoRecID extends IdentifierComplexType {
	public LidoRecID() {}

	public LidoRecID(IdentifierComplexType identifierComplexType) {
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
