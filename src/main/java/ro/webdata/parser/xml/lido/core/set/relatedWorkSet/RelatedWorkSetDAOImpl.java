package ro.webdata.parser.xml.lido.core.set.relatedWorkSet;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RelatedWorkSetDAOImpl implements RelatedWorkSetDAO {
    private static RelatedWorkSetComplexTypeDAO relatedWorkSetComplexTypeDAO = new RelatedWorkSetComplexTypeDAOImpl();

    public RelatedWorkSet getRelatedWorkSet(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new RelatedWorkSet(
                relatedWorkSetComplexTypeDAO.getRelatedWorkSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
