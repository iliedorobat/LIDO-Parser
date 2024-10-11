package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Indicates the format of the data source from which the data
 * 		were migrated. For each sub-element with data values then the related source data
 * 		fields can be referenced through the attributes encodinganalog and label.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoRelatedEncoding {
	private String relatedEncoding;

	public LidoRelatedEncoding() {}

	public LidoRelatedEncoding(String relatedEncoding) {
		setRelatedEncoding(relatedEncoding);
	}

	public String getRelatedEncoding() {
		return relatedEncoding;
	}

	public void setRelatedEncoding(String relatedEncoding) {
		this.relatedEncoding = relatedEncoding;
	}

	public String getAttrValue() {
		return relatedEncoding;
	}

	public String getAttrName() {
		return "lido:relatedencoding";
	}
}
