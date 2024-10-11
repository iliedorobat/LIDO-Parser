package ro.webdata.parser.xml.lido.core.leaf.category;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class CategoryDAOImpl implements CategoryDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public Category getCategory(Node node) {
        return new Category(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
