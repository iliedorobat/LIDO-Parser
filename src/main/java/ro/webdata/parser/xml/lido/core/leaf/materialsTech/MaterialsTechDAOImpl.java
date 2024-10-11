package ro.webdata.parser.xml.lido.core.leaf.materialsTech;

import ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType.MaterialsTechComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType.MaterialsTechComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class MaterialsTechDAOImpl implements MaterialsTechDAO {
    private static MaterialsTechComplexTypeDAO materialsTechComplexTypeDAO = new MaterialsTechComplexTypeDAOImpl();

    public MaterialsTech getMaterialsTech(Node node) {
        return new MaterialsTech(materialsTechComplexTypeDAO.getMaterialsTechComplexType(node));
    }
}
