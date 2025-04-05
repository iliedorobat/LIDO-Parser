package ro.webdata.parser.xml.lido.core.set.measurementsSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType.MeasurementsSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType.MeasurementsSetComplexTypeDAOImpl;

import java.util.Map;

public class MeasurementsSetDAOImpl implements MeasurementsSetDAO {
    private MeasurementsSetComplexTypeDAO measurementsSetComplexTypeDAO = new MeasurementsSetComplexTypeDAOImpl();

    public MeasurementsSet getMeasurementsSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new MeasurementsSet(
                measurementsSetComplexTypeDAO.getMeasurementsSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
