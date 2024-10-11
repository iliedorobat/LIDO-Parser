package ro.webdata.parser.xml.lido.core.leaf.displayActorInRole;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayActorInRoleDAOImpl implements DisplayActorInRoleDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActorInRole getDisplayActorInRole(Node node) {
        return new DisplayActorInRole(textComplexTypeDAO.getTextComplexType(node));
    }
}
