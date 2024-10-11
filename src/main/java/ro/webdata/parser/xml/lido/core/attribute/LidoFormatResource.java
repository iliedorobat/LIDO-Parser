package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Indicates the internet media type, e.g. the file
 * 		format of the given web resource.<br/>
 * 		<b>How to record:</b> Data values should be taken from the official
 * 		IANA list (see http://www.iana.org/assignments/media-types/). Includes:
 * 		text/html, text/xml, image/jpeg, audio/mpeg, video/mpeg, application/pdf.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoFormatResource {
	private String formatResource;

	public LidoFormatResource() {}

	public LidoFormatResource(String formatResource) {
		setFormatResource(formatResource);
	}

	public String getFormatResource() {
		return formatResource;
	}

	public void setFormatResource(String formatResource) {
		this.formatResource = formatResource;
	}

	public String getAttrValue() {
		return formatResource;
	}

	public String getAttrName() {
		return "formatResource";
	}
}
