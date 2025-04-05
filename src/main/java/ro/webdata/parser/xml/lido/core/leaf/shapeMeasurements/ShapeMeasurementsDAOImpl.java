package ro.webdata.parser.xml.lido.core.leaf.shapeMeasurements;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

import java.util.Map;

public class ShapeMeasurementsDAOImpl implements ShapeMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ShapeMeasurements getShapeMeasurements(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new ShapeMeasurements(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
