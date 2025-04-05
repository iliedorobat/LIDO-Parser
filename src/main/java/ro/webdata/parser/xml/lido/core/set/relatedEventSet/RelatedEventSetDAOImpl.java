package ro.webdata.parser.xml.lido.core.set.relatedEventSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.relatedEventSetComplexType.RelatedEventSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.relatedEventSetComplexType.RelatedEventSetComplexTypeDAOImpl;

import java.util.Map;

public class RelatedEventSetDAOImpl implements RelatedEventSetDAO {
    private static RelatedEventSetComplexTypeDAO relatedEventSetComplexTypeDAO = new RelatedEventSetComplexTypeDAOImpl();

    public RelatedEventSet getRelatedEventSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new RelatedEventSet(
                relatedEventSetComplexTypeDAO.getRelatedEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
