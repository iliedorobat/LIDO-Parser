package ro.webdata.parser.xml.lido.core.leaf.resourceDescription;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ResourceDescriptionDAOImpl implements ResourceDescriptionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ResourceDescription getResourceDescription(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ResourceDescription(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}