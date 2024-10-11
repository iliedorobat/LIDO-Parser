package ro.webdata.parser.xml.lido.core.attribute;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Codec information about the digital resource.<br/>
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoCodecResource {
	private String codecResource;

	public LidoCodecResource() {}

	public LidoCodecResource(String codecResource) {
		setCodecResource(codecResource);
	}

	public String getCodecResource() {
		return codecResource;
	}

	public void setCodecResource(String codecResource) {
		this.codecResource = codecResource;
	}

	public String getAttrValue() {
		return codecResource;
	}

	public String getAttrName() {
		return "codecResource";
	}
}
