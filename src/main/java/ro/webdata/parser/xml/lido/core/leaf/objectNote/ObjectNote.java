package ro.webdata.parser.xml.lido.core.leaf.objectNote;

import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A descriptive identification of the object / work that
 * 			will be meaningful to end-users, including some or all of the following information,
 * 			as necessary for clarity and if known: title, object/work type, important actor,
 * 			date and/or place information, potentially location of the object / work.<br/>
 * 			<b>How to record:</b> The information should ideally be generated from
 * 			fields/elements in the related record.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectNote extends TextComplexType {
	private LidoType type;

	public ObjectNote() {}

	public ObjectNote(TextComplexType textComplexType, LidoType type) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
		setType(type);
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}
}
