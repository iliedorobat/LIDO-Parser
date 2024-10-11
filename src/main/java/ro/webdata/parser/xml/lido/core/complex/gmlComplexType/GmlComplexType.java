package ro.webdata.parser.xml.lido.core.complex.gmlComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.gml.GmlLineString;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPoint;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPolygon;

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
	private ArrayList<GmlPoint> point;
	private ArrayList<GmlLineString> lineString;
	private ArrayList<GmlPolygon> polygon;

	public GmlComplexType() {}

	public GmlComplexType(ArrayList<GmlPoint> point, ArrayList<GmlLineString> lineString, ArrayList<GmlPolygon> polygon) {
		setPoint(point);
		setLineString(lineString);
		setPolygon(polygon);
	}

	public ArrayList<GmlPoint> getPoint() {
		return point;
	}

	public void setPoint(ArrayList<GmlPoint> point) {
		this.point = point;
	}

	public ArrayList<GmlLineString> getLineString() {
		return lineString;
	}

	public void setLineString(ArrayList<GmlLineString> lineString) {
		this.lineString = lineString;
	}

	public ArrayList<GmlPolygon> getPolygon() {
		return polygon;
	}

	public void setPolygon(ArrayList<GmlPolygon> polygon) {
		this.polygon = polygon;
	}
}
