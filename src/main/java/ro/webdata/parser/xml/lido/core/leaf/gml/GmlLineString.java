package ro.webdata.parser.xml.lido.core.leaf.gml;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Notes:</b> For documentation on GML refer to <a href="http://www.opengis.net/gml/">http://www.opengis.net/gml/</a>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
//TODO: review the following documentation http://www.opengis.net/gml/
public class GmlLineString {
	private String lineString;

	public GmlLineString() {}

	public GmlLineString(String lineString) {
		setLineString(lineString);
	}

	public String getLineString() {
		return lineString;
	}

	public void setLineString(String lineString) {
		this.lineString = lineString;
	}
}
