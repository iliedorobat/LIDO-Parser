package ro.webdata.parser.xml.lido.core.set.relatedWorkSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexTypeDAOImpl;

import java.util.Map;

public class RelatedWorkSetDAOImpl implements RelatedWorkSetDAO {
    private static RelatedWorkSetComplexTypeDAO relatedWorkSetComplexTypeDAO = new RelatedWorkSetComplexTypeDAOImpl();

    public RelatedWorkSet getRelatedWorkSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new RelatedWorkSet(
                relatedWorkSetComplexTypeDAO.getRelatedWorkSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
