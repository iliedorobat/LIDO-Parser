package ro.webdata.lido.parser.core.complex.placeSetComplexType;

import ro.webdata.lido.parser.core.leaf.displayPlace.DisplayPlaceDAO;
import ro.webdata.lido.parser.core.leaf.place.PlaceDAO;
import ro.webdata.lido.parser.core.leaf.displayPlace.DisplayPlaceDAOImpl;
import ro.webdata.lido.parser.core.leaf.place.PlaceDAOImpl;
import ro.webdata.lido.parser.core.leaf.displayPlace.DisplayPlace;
import ro.webdata.lido.parser.core.leaf.place.Place;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class PlaceSetComplexTypeDAOImpl implements PlaceSetComplexTypeDAO {
    private static DisplayPlaceDAO displayPlaceParser = new DisplayPlaceDAOImpl();
    private static PlaceDAO placeParser = new PlaceDAOImpl();

    public PlaceSetComplexType getPlaceSetComplexType(Node node) {
        ArrayList<DisplayPlace> displayPlaceList = new ArrayList<DisplayPlace>();
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