package ro.webdata.parser.xml.lido.core.leaf.sourceMaterialsTech;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class SourceMaterialsTechDAOImpl implements SourceMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceMaterialsTech getSourceMaterialsTech(Node node) {
        return new SourceMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
