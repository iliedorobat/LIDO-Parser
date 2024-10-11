package ro.webdata.parser.xml.lido.core.leaf.objectPublishedID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A unique, published identification of the described object / work.<br/>
 * 			<b>How to record:</b> May link to authority files maintained outside of the contributor's
 * 			documentation system or may be an identifier for the object published by its repository,
 * 			e.g. composed of an identifier for the repository and an inventory number of the object.
 * 			Preferably a dereferenceable URL.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectPublishedID extends IdentifierComplexType {
	public ObjectPublishedID() {}

	public ObjectPublishedID(IdentifierComplexType identifierComplexType) {
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
