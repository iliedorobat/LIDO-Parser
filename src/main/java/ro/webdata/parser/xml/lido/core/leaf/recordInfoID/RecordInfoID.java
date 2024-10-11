package ro.webdata.parser.xml.lido.core.leaf.recordInfoID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Unique ID of the metadata.<br/>
 * 			<b>How to record:</b> Record Info ID has the same definition as Record ID
 * 			but out of the context of original local system, such as a persistent identifier
 * 			or an oai identifier (e.g., oai1:getty.edu:paintings/00001234 attribute type= oai).
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordInfoID extends IdentifierComplexType {
	public RecordInfoID() {}

	public RecordInfoID(IdentifierComplexType identifierComplexType) {
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
