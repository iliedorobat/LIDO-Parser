package ro.webdata.parser.xml.lido.core.leaf.thingPresent;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAOImpl;

import java.util.Map;

public class ThingPresentDAOImpl implements ThingPresentDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();

    public ThingPresent getThingPresent(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new ThingPresent(
                objectSetComplexTypeDAO.getObjectSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
