package ro.webdata.parser.xml.lido.core.complex.gmlComplexType;

import ro.webdata.parser.xml.lido.core.leaf.gml.GmlLineString;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPoint;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPolygon;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class GmlComplexTypeDAOImpl implements GmlComplexTypeDAO {
    public GmlComplexType getGmlComplexType(Node node) {
        ArrayList<GmlPoint> gmlPointList = new ArrayList<GmlPoint>();
        ArrayList<GmlLineString> gmlLineStringList = new ArrayList<GmlLineString>();
        ArrayList<GmlPolygon> gmlPolygonList = new ArrayList<GmlPolygon>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "gml:Point":
                    gmlPointList.add(new GmlPoint(child.getTextContent()));
                    break;
                case "gml:LineString":
                    gmlLineStringList.add(new GmlLineString(child.getTextContent()));
                    break;
                case "gml:Polygon":
                    gmlPolygonList.add(new GmlPolygon(child.getTextContent()));
                    break;
                default: break;
            }
        }

        return new GmlComplexType(
                gmlPointList, gmlLineStringList, gmlPolygonList
        );
    }
}
