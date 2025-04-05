package ro.webdata.parser.xml.lido.core.complex.gmlComplexType;

import ro.webdata.parser.xml.lido.core.leaf.gml.GmlLineString;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPoint;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPolygon;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Specifies the GML instantiation for georeferences.<br/>
 * 		<b>Notes:</b> For documentation on GML refer to <a href="http://www.opengis.net/gml/">
 * 		http://www.opengis.net/gml/</a><br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>point (0-unbounded)</b><br/>
 * 			<b>lineString (0-unbounded)</b><br/>
 * 			<b>polygon (0-unbounded)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class GmlComplexType {
	private List<GmlPoint> point;
	private List<GmlLineString> lineString;
	private List<GmlPolygon> polygon;

	public GmlComplexType() {}

	public GmlComplexType(List<GmlPoint> point, List<GmlLineString> lineString, List<GmlPolygon> polygon) {
		setPoint(point);
		setLineString(lineString);
		setPolygon(polygon);
	}

	public List<GmlPoint> getPoint() {
		return point;
	}

	public void setPoint(List<GmlPoint> point) {
		this.point = point;
	}

	public List<GmlLineString> getLineString() {
		return lineString;
	}

	public void setLineString(List<GmlLineString> lineString) {
		this.lineString = lineString;
	}

	public List<GmlPolygon> getPolygon() {
		return polygon;
	}

	public void setPolygon(List<GmlPolygon> polygon) {
		this.polygon = polygon;
	}
}
