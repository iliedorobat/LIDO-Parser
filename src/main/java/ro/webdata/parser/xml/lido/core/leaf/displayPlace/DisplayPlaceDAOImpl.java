package ro.webdata.parser.xml.lido.core.leaf.displayPlace;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayPlaceDAOImpl implements DisplayPlaceDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayPlace getDisplayPlace(Node node) {
        return new DisplayPlace(textComplexTypeDAO.getTextComplexType(node));
    }
}
