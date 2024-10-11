package ro.webdata.parser.xml.lido.core.complex.textComplexType;

import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Simple text element with encodinganalog and label attribute.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>text (xsd:string)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The text content of the node.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>lang (xml:lang)</b><br/>
 * 			<b>encodingAnalog (lido:encodinganalog)</b><br/>
 * 			<b>label (lido:label)</b><br/>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class TextComplexType {
	private String text;
	private XmlLang lang;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;

	public TextComplexType() {}

	public TextComplexType(String text, XmlLang lang, LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setLang(lang);
		setEncodingAnalog(encodingAnalog);
		setLabel(label);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text.trim();
	}

	public XmlLang getLang() {
		return lang;
	}

	public void setLang(XmlLang lang) {
		this.lang = lang;
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
