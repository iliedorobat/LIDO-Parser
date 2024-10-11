package ro.webdata.parser.xml.lido.core.leaf.partOfPlace;

import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class PartOfPlaceDAOImpl implements PartOfPlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public PartOfPlace getPartOfPlace(Node node) {
        return new PartOfPlace(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
