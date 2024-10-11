package ro.webdata.parser.xml.lido.core.leaf.termMaterialsTech;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TermMaterialsTechDAOImpl implements TermMaterialsTechDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public TermMaterialsTech getTermMaterialsTech(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new TermMaterialsTech(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
