package ro.webdata.parser.xml.lido.core.leaf.recordType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RecordTypeDAOImpl implements RecordTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RecordType getRecordType(Node node) {
        return new RecordType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
