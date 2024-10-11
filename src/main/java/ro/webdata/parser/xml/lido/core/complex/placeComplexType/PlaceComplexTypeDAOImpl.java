package ro.webdata.parser.xml.lido.core.complex.placeComplexType;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlDAO;
import ro.webdata.parser.xml.lido.core.leaf.partOfPlace.PartOfPlaceDAO;
import ro.webdata.parser.xml.lido.core.leaf.placeClassification.PlaceClassificationDAO;
import ro.webdata.parser.xml.lido.core.leaf.placeID.PlaceIDDAO;
import ro.webdata.parser.xml.lido.core.set.namePlaceSet.NamePlaceSetDAO;
import ro.webdata.parser.xml.lido.core.leaf.gml.GmlDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.partOfPlace.PartOfPlaceDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.placeClassification.PlaceClassificationDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.placeID.PlaceIDDAOImpl;
import ro.webdata.parser.xml.lido.core.set.namePlaceSet.NamePlaceSetDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoGeographicalEntity;
import ro.webdata.parser.xml.lido.core.attribute.LidoPoliticalEntity;
import ro.webdata.parser.xml.lido.core.leaf.gml.Gml;
import ro.webdata.parser.xml.lido.core.leaf.partOfPlace.PartOfPlace;
import ro.webdata.parser.xml.lido.core.leaf.placeClassification.PlaceClassification;
import ro.webdata.parser.xml.lido.core.leaf.placeID.PlaceID;
import ro.webdata.parser.xml.lido.core.set.namePlaceSet.NamePlaceSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class PlaceComplexTypeDAOImpl implements PlaceComplexTypeDAO {
    private static PlaceIDDAO placeIDParser = new PlaceIDDAOImpl();
    private static NamePlaceSetDAO namePlaceSetParser = new NamePlaceSetDAOImpl();
    private static GmlDAO gmlParser = new GmlDAOImpl();
    private static PartOfPlaceDAO partOfPlaceParser = new PartOfPlaceDAOImpl();
    private static PlaceClassificationDAO placeClassificationParser = new PlaceClassificationDAOImpl();

    public PlaceComplexType getPlaceComplexType(Node node) {
        ArrayList<PlaceID> placeIDList = new ArrayList<PlaceID>();
        ArrayList<NamePlaceSet> namePlaceSetList = new ArrayList<NamePlaceSet>();
        ArrayList<Gml> gmlList = new ArrayList<Gml>();
        ArrayList<PartOfPlace> partOfPlaceList = new ArrayList<PartOfPlace>();
        ArrayList<PlaceClassification> placeClassificationList = new ArrayList<PlaceClassification>();
        HashMap<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:placeID":
                    placeIDList.add(placeIDParser.getPlaceID(child));
                    break;
                case "lido:namePlaceSet":
                    namePlaceSetList.add(namePlaceSetParser.getNamePlaceSet(child));
                    break;
                case "lido:gml":
                    gmlList.add(gmlParser.getGml(child));
                    break;
                case "lido:partOfPlace":
                    partOfPlaceList.add(partOfPlaceParser.getPartOfPlace(child));
                    break;
                case "lido:placeClassification":
                    placeClassificationList.add(placeClassificationParser.getPlaceClassification(child));
                    break;
                default: break;
            }
        }

        return new PlaceComplexType(
                placeIDList, namePlaceSetList, gmlList,
                partOfPlaceList, placeClassificationList,
                new LidoPoliticalEntity(attributes.get("lido:politicalEntity")),
                new LidoGeographicalEntity(attributes.get("lido:geographicalEntity"))
        );
    }
}
