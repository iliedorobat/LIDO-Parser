package ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsSetComplexType.ObjectMeasurementsSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsSetComplexType.ObjectMeasurementsSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ObjectMeasurementsSetDAOImpl implements ObjectMeasurementsSetDAO {
    private static ObjectMeasurementsSetComplexTypeDAO objectMeasurementsSetComplexTypeDAO = new ObjectMeasurementsSetComplexTypeDAOImpl();

    public ObjectMeasurementsSet getObjectMeasurementsSet(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new ObjectMeasurementsSet(
                objectMeasurementsSetComplexTypeDAO.getObjectMeasurementsSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
