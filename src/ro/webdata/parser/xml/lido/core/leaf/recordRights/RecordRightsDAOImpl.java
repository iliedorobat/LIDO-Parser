package ro.webdata.parser.xml.lido.core.leaf.recordRights;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RecordRightsDAOImpl implements RecordRightsDAO {
    private static RightsComplexTypeDAO rightsComplexTypeDAO = new RightsComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RecordRights getRecordRights(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RecordRights(
                rightsComplexTypeDAO.getRightsComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
