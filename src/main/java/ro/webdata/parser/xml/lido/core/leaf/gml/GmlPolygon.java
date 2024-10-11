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
public class GmlPolygon {
	private String polygon;

	public GmlPolygon() {}

	public GmlPolygon(String polygon) {
		setPolygon(polygon);
	}

	public String getPolygon() {
		return polygon;
	}

	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}
}
