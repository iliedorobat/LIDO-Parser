package ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID;

import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DescriptiveNoteIDDAOImpl implements DescriptiveNoteIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public DescriptiveNoteID getDescriptiveNoteID(Node node) {
        return new DescriptiveNoteID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
