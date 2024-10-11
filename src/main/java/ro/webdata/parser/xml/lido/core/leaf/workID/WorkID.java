package ro.webdata.parser.xml.lido.core.leaf.workID;

import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> An unambiguous numeric or alphanumeric identification
 * 			number, assigned to the object by the institution of custody.<br/>
 *
 * 			<b>Elements:</b>
 * 			<div class="lido-elem">
 * 				<b>text (xsd:string)</b>
 * 				<div class="lido-elem-doc">
 * 					<b>Definition:</b> The text content of the node.
 * 				</div>
 * 			</div>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type</b><br/>
 * 				<b>sortOrder</b><br/>
 * 				<b>encodingAnalog</b><br/>
 * 				<b>label</b><br/>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class WorkID {
	private String text;
	private LidoType type;
	private LidoSortOrder sortOrder;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;

	public WorkID() {}

	public WorkID(String text, LidoType type, LidoSortOrder sortOrder, LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setType(type);
		setSortOrder(sortOrder);
		setEncodingAnalog(encodingAnalog);
		setLabel(label);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text.trim();
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

	public LidoEncodingAnalog getEncodingAnalog() {
		return encodingAnalog;
	}

	public void setEncodingAnalog(LidoEncodingAnalog encodingAnalog) {
		this.encodingAnalog = encodingAnalog;
	}

	public LidoLabel getLabel() {
		return label;
	}

	public void setLabel(LidoLabel label) {
		this.label = label;
	}
}
