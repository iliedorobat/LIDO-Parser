package ro.webdata.parser.xml.lido.core.leaf.displayObjectMeasurements;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayObjectMeasurementsDAOImpl implements DisplayObjectMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObjectMeasurements getDisplayObjectMeasurements(Node node) {
        return new DisplayObjectMeasurements(textComplexTypeDAO.getTextComplexType(node));
    }
}
