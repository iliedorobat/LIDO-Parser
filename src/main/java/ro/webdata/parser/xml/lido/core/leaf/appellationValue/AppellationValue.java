package ro.webdata.parser.xml.lido.core.leaf.appellationValue;

import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoPref;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Appellations, e.g. titles, identifying phrases,
 * 		or names given to an item, but also name of a person or corporation,
 * 		also place name etc.<br/>
 * 		<b>How to record:</b> Repeat this element only for language variants.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>pref (lido:pref)</b><br/>
 * 			<b>lang (xml:lang)</b><br/>
 * 			<b>encodingAnalog (lido:encodinganalog)</b><br/>
 * 			<b>label (lido:label)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class AppellationValue {
	private String text;
	private LidoPref pref;
	private XmlLang lang;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;

	public AppellationValue() {}

	public AppellationValue(String text, LidoPref pref, XmlLang lang, LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setPref(pref);
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
