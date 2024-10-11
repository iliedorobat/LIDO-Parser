package ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink;

import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class LegalBodyWeblinkDAOImpl implements LegalBodyWeblinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public LegalBodyWeblink getLegalBodyWeblink(Node node) {
        return new LegalBodyWeblink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
