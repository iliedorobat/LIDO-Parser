package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Source of the information given in the holding element.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoSource {
	private String source;

	public LidoSource() {}

	public LidoSource(String source) {
		setSource(source);
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAttrValue() {
		return source;
	}

	public String getAttrName() {
		return "lido:source";
	}
}
