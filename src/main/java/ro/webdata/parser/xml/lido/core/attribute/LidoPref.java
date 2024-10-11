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
public class LidoPref {
	private String pref;

	public LidoPref() {}

	public LidoPref(String pref) {
		setPref(pref);
	}

	public String getPref() {
		return pref;
	}

	public void setPref(String pref) {
		this.pref = pref;
	}

	public String getAttrValue() {
		return pref;
	}

	public String getAttrName() {
		return "lido:pref";
	}
}
