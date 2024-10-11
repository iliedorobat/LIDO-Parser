package ro.webdata.parser.xml.lido.core.leaf.displayEdition;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayEditionDAOImpl implements DisplayEditionDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEdition getDisplayEdition(Node node) {
        return new DisplayEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
