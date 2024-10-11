package ro.webdata.parser.xml.lido.core.leaf.displayMaterialsTech;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayMaterialsTechDAOImpl implements DisplayMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayMaterialsTech getDisplayMaterialsTech(Node node) {
        return new DisplayMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
