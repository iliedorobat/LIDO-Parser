package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Qualifies the value as a preferred or alternative variant.<br/>
 * 		<b>How to record:</b> Data values: preferred, alternate.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
//https://www.w3.org/International/questions/qa-when-xmllang
public class XmlLang {
	private String lang;

	public XmlLang() {}

	public XmlLang(String lang) {
		setLang(lang);
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getAttrValue() {
		return lang;
	}

	public String getAttrName() {
		return "xml:lang";
	}
}
