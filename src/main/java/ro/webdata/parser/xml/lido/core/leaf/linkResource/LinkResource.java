package ro.webdata.parser.xml.lido.core.leaf.linkResource;

import ro.webdata.parser.xml.lido.core.attribute.LidoCodecResource;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A url reference in the worldwide web environment.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>codecResource (xsd:string)</b>
 * 			<div class="lido-attr-doc">
 * 				<b>Definition:</b> Codec information about the digital resource.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LinkResource extends WebResourceComplexType {
	private LidoCodecResource codecResource;

	public LinkResource() {}

	public LinkResource(WebResourceComplexType webResourceComplexType, LidoCodecResource codecResource) {
		super(
			webResourceComplexType.getText(),
			webResourceComplexType.getPref(),
			webResourceComplexType.getFormatResource(),
			webResourceComplexType.getLang(),
			webResourceComplexType.getEncodingAnalog(),
			webResourceComplexType.getLabel()
		);
		setCodecResource(codecResource);
	}

	public LidoCodecResource getCodecResource() {
		return codecResource;
	}

	public void setCodecResource(LidoCodecResource codecResource) {
		this.codecResource = codecResource;
	}
}
