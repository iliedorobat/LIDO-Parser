package ro.webdata.parser.xml.lido.core.leaf.creditLine;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class CreditLineDAOImpl implements CreditLineDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public CreditLine getCreditLine(Node node) {
        return new CreditLine(textComplexTypeDAO.getTextComplexType(node));
    }
}
