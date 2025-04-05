package ro.webdata.parser.xml.lido.core.leaf.scaleMeasurements;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

import java.util.Map;

public class ScaleMeasurementsDAOImpl implements ScaleMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ScaleMeasurements getScaleMeasurements(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new ScaleMeasurements(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
