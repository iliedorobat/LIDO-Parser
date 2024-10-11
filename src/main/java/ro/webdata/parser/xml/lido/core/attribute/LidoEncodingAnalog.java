package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>How to record:</b> Elements with data values are accompanied by the attributes encodinganalog 
 * 		and label to indicate the format of the data source from which the data were migrated. The 
 * 		attribute encodinganalog refers to the internal field label of the source database. The source 
 * 		format is indicated in the attribute relatedencoding of the lidoWrap.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoEncodingAnalog {
	private String encodingAnalog;

	public LidoEncodingAnalog() {}

	public LidoEncodingAnalog(String encodingAnalog) {
		setEncodingAnalog(encodingAnalog);
	}

	public String getEncodingAnalog() {
		return encodingAnalog;
	}

	public void setEncodingAnalog(String encodingAnalog) {
		this.encodingAnalog = encodingAnalog;
	}

	public String getAttrValue() {
		return encodingAnalog;
	}

	public String getAttrName() {
		return "lido:encodinganalog";
	}
}
