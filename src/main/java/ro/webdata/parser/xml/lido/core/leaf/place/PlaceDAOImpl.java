package ro.webdata.parser.xml.lido.core.leaf.place;

import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class PlaceDAOImpl implements PlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public Place getPlace(Node node) {
        return new Place(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
