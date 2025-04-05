package ro.webdata.parser.xml.lido.core.leaf.gml;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import ro.webdata.parser.xml.lido.core.complex.gmlComplexType.GmlComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.gmlComplexType.GmlComplexTypeDAOImpl;

import java.util.Map;

public class GmlDAOImpl implements GmlDAO {
    private static GmlComplexTypeDAO gmlComplexTypeDAO = new GmlComplexTypeDAOImpl();

    public Gml getGml(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new Gml(
                gmlComplexTypeDAO.getGmlComplexType(node),
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}
