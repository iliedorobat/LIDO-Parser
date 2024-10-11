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
public class GmlPoint {
	private String point;

	public GmlPoint() {}

	public GmlPoint(String point) {
		setPoint(point);
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}
}
