package ro.webdata.parser.xml.lido.core.leaf.displayEvent;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayEventDAOImpl implements DisplayEventDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEvent getDisplayEvent(Node node) {
        return new DisplayEvent(textComplexTypeDAO.getTextComplexType(node));
    }
}
