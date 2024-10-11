package ro.webdata.parser.xml.lido.core.leaf.objectID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A descriptive identification of the object / work that
 * 			will be meaningful to end-users, including some or all of the following
 * 			information, as necessary for clarity and if known: title, object/work type,
 * 			important actor, date and/or place information, potentially location of the
 * 			object / work.<br/>
 * 			<b>How to record:</b> The information should ideally be generated from
 * 			fields/elements in the related record.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectID extends IdentifierComplexType {
	public ObjectID() {}

	public ObjectID(IdentifierComplexType identifierComplexType) {
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
