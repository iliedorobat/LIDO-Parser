package ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsSetComplexType.ObjectMeasurementsSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsSetComplexType.ObjectMeasurementsSetComplexTypeDAOImpl;

import java.util.Map;

public class ObjectMeasurementsSetDAOImpl implements ObjectMeasurementsSetDAO {
    private static ObjectMeasurementsSetComplexTypeDAO objectMeasurementsSetComplexTypeDAO = new ObjectMeasurementsSetComplexTypeDAOImpl();

    public ObjectMeasurementsSet getObjectMeasurementsSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new ObjectMeasurementsSet(
                objectMeasurementsSetComplexTypeDAO.getObjectMeasurementsSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
