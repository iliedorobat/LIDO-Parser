package ro.webdata.lido.parser.core.leaf.displayActor;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayActorDAOImpl implements DisplayActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActor getDisplayActor(Node node) {
        return new DisplayActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
