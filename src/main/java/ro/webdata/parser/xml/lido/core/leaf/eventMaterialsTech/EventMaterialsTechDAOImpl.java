package ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.materialsTechSetComplexType.MaterialsTechSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.materialsTechSetComplexType.MaterialsTechSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventMaterialsTechDAOImpl implements EventMaterialsTechDAO {
    private static MaterialsTechSetComplexTypeDAO materialsTechSetComplexTypeDAO = new MaterialsTechSetComplexTypeDAOImpl();

    public EventMaterialsTech getEventMaterialsTech(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new EventMaterialsTech(
                materialsTechSetComplexTypeDAO.getMaterialsTechSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
