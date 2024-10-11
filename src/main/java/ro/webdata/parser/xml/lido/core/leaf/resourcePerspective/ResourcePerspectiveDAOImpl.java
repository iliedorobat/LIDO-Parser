package ro.webdata.parser.xml.lido.core.leaf.resourcePerspective;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ResourcePerspectiveDAOImpl implements ResourcePerspectiveDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourcePerspective getResourcePerspective(Node node) {
        return new ResourcePerspective(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
