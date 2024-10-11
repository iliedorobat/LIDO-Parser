package ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class SourceStateEditionDAOImpl implements SourceStateEditionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceStateEdition getSourceStateEdition(Node node) {
        return new SourceStateEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
