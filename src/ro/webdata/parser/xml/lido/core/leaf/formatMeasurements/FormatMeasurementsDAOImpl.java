package ro.webdata.parser.xml.lido.core.leaf.formatMeasurements;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class FormatMeasurementsDAOImpl implements FormatMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public FormatMeasurements getFormatMeasurements(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new FormatMeasurements(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
