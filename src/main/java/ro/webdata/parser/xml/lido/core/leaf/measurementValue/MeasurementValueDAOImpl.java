package ro.webdata.parser.xml.lido.core.leaf.measurementValue;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class MeasurementValueDAOImpl implements MeasurementValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementValue getMeasurementValue(Node node) {
        return new MeasurementValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
