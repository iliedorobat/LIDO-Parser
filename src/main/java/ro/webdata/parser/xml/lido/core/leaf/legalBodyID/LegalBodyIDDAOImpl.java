package ro.webdata.parser.xml.lido.core.leaf.legalBodyID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class LegalBodyIDDAOImpl implements LegalBodyIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LegalBodyID getLegalBodyID(Node node) {
        return new LegalBodyID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
