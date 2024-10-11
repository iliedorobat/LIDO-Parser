package ro.webdata.parser.xml.lido.core.leaf.resourceID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ResourceIDDAOImpl implements ResourceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ResourceID getResourceID(Node node) {
        return new ResourceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
