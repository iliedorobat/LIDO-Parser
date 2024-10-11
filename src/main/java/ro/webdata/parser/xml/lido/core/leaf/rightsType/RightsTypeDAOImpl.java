package ro.webdata.parser.xml.lido.core.leaf.rightsType;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RightsTypeDAOImpl implements RightsTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RightsType getRightsType(Node node) {
        return new RightsType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
