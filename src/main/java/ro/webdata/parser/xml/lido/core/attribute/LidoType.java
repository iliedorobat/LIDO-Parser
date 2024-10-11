package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Qualifies the type of information given in the holding element.<br/>
 * 		<b>How to record:</b> Will generally have to be populated with a given value list.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoType {
	private String type;

	public LidoType() {}

	public LidoType(String type) {
		setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAttrValue() {
		return type;
	}

	public String getAttrName() {
		return "lido:type";
	}
}
