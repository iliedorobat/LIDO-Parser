package ro.webdata.parser.xml.lido.core.leaf.classification;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ClassificationDAOImpl implements ClassificationDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public Classification getClassification(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new Classification(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
