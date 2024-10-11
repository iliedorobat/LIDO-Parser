package ro.webdata.parser.xml.lido.core.leaf.displayActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayActorDAOImpl implements DisplayActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActor getDisplayActor(Node node) {
        return new DisplayActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
