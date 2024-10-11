package ro.webdata.parser.xml.lido.core.complex.webResourceComplexType;

import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoFormatResource;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoPref;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A uri/url reference to a web resource that
 * 		describes / represents the item, e.g. a metadata record.<br/>
 * 		<b>Notes:</b> It differs from an identifier for the item itself.<br/>
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
 * 			<b>pref (lido:pref)</b><br/>
 * 			<b>formatResource (xsd:string)</b><br/>
 * 			<b>lang (xml:lang)</b><br/>
 * 			<b>encodingAnalog (lido:encodinganalog)</b><br/>
 * 			<b>label (lido:label)</b><br/>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class WebResourceComplexType {
	private String text;
	private LidoPref pref;
	private LidoFormatResource formatResource;
	private XmlLang lang;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;

	public WebResourceComplexType() {}

	public WebResourceComplexType(String text, LidoPref pref, LidoFormatResource formatResource,
			XmlLang lang, LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setPref(pref);
		setFormatResource(formatResource);
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

	public LidoPref getPref() {
		return pref;
	}

	public void setPref(LidoPref pref) {
		this.pref = pref;
	}

	public LidoFormatResource getFormatResource() {
		return formatResource;
	}

	public void setFormatResource(LidoFormatResource formatResource) {
		this.formatResource = formatResource;
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
