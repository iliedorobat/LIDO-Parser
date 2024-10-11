package ro.webdata.parser.xml.lido.core.leaf.conceptID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ConceptIDDAOImpl implements ConceptIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ConceptID getConceptID(Node node) {
        return new ConceptID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
