package ro.webdata.parser.xml.lido.core.complex.placeSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.displayPlace.DisplayPlace;
import ro.webdata.parser.xml.lido.core.leaf.displayPlace.DisplayPlaceDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayPlace.DisplayPlaceDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.place.Place;
import ro.webdata.parser.xml.lido.core.leaf.place.PlaceDAO;
import ro.webdata.parser.xml.lido.core.leaf.place.PlaceDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class PlaceSetComplexTypeDAOImpl implements PlaceSetComplexTypeDAO {
    private static DisplayPlaceDAO displayPlaceParser = new DisplayPlaceDAOImpl();
    private static PlaceDAO placeParser = new PlaceDAOImpl();

    public PlaceSetComplexType getPlaceSetComplexType(Node node) {
        List<DisplayPlace> displayPlaceList = new ArrayList<DisplayPlace>();
        Place place = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayPlace":
                    displayPlaceList.add(displayPlaceParser.getDisplayPlace(child));
                    break;
                case "lido:place":
                    place = placeParser.getPlace(child);
                    break;
                default: break;
            }
        }

        return new PlaceSetComplexType(displayPlaceList, place);
    }
}
