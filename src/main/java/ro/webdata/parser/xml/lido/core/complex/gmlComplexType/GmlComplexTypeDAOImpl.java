package ro.webdata.parser.xml.lido.core.complex.gmlComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlLineString;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPoint;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlPolygon;

import java.util.ArrayList;
import java.util.List;

public class GmlComplexTypeDAOImpl implements GmlComplexTypeDAO {
    public GmlComplexType getGmlComplexType(Node node) {
        List<GmlPoint> gmlPointList = new ArrayList<GmlPoint>();
        List<GmlLineString> gmlLineStringList = new ArrayList<GmlLineString>();
        List<GmlPolygon> gmlPolygonList = new ArrayList<GmlPolygon>();

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
