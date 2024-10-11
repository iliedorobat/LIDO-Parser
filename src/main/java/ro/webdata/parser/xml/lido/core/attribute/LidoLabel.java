package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>How to record:</b> Elements with data values are accompanied by the attributes
 * 		encodinganalog and label, to indicate the format of the data source from which the
 * 		data were migrated. The attribute label refers to the external label of a data field
 * 		at the visible user interface. The source format is indicated in the attribute.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoLabel {
	private String label;

	public LidoLabel() {}

	public LidoLabel(String label) {
		setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAttrValue() {
		return label;
	}

	public String getAttrName() {
		return "lido:label";
	}
}
