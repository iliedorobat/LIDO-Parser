package ro.webdata.parser.xml.lido.core.leaf.gml;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.gmlComplexType.GmlComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.gmlComplexType.GmlComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GmlDAOImpl implements GmlDAO {
    private static GmlComplexTypeDAO gmlComplexTypeDAO = new GmlComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public Gml getGml(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new Gml(
                gmlComplexTypeDAO.getGmlComplexType(node),
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}