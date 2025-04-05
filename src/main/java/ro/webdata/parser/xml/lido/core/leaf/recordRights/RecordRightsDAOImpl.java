package ro.webdata.parser.xml.lido.core.leaf.recordRights;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexTypeDAOImpl;

import java.util.Map;

public class RecordRightsDAOImpl implements RecordRightsDAO {
    private static RightsComplexTypeDAO rightsComplexTypeDAO = new RightsComplexTypeDAOImpl();

    public RecordRights getRecordRights(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new RecordRights(
                rightsComplexTypeDAO.getRightsComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
