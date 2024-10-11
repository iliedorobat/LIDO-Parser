package ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Identifier for an external resource describing the entity.<br/>
 * 			<b>How to record:</b> The referenced resource may be any kind of document, preferably web-accessible.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DescriptiveNoteID extends IdentifierComplexType {
	public DescriptiveNoteID() {}

	public DescriptiveNoteID(IdentifierComplexType identifierComplexType) {
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
