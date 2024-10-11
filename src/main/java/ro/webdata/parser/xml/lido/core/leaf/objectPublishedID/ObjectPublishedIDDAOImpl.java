package ro.webdata.parser.xml.lido.core.leaf.objectPublishedID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectPublishedIDDAOImpl implements ObjectPublishedIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectPublishedID getObjectPublishedID(Node node) {
        return new ObjectPublishedID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
