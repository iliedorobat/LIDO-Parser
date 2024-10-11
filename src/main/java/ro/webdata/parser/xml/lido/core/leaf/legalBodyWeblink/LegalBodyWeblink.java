package ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink;

import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Weblink of the institution or person referred to as legal body.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LegalBodyWeblink extends WebResourceComplexType {
	public LegalBodyWeblink() {}

	public LegalBodyWeblink(WebResourceComplexType webResourceComplexType) {
		super(
			webResourceComplexType.getText(),
			webResourceComplexType.getPref(),
			webResourceComplexType.getFormatResource(),
			webResourceComplexType.getLang(),
			webResourceComplexType.getEncodingAnalog(),
			webResourceComplexType.getLabel()
		);
	}
}
