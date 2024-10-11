package ro.webdata.parser.xml.lido.core.leaf.displayDate;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayDateDAOImpl implements DisplayDateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayDate getDisplayDate(Node node) {
        return new DisplayDate(textComplexTypeDAO.getTextComplexType(node));
    }
}
