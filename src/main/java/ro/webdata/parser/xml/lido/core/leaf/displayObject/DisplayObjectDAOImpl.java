package ro.webdata.parser.xml.lido.core.leaf.displayObject;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayObjectDAOImpl implements DisplayObjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObject getDisplayObject(Node node) {
        return new DisplayObject(textComplexTypeDAO.getTextComplexType(node));
    }
}
