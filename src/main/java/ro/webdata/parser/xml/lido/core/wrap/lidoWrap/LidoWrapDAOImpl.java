package ro.webdata.parser.xml.lido.core.wrap.lidoWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoRelatedEncoding;
import ro.webdata.parser.xml.lido.core.leaf.lido.Lido;
import ro.webdata.parser.xml.lido.core.leaf.lido.LidoDAO;
import ro.webdata.parser.xml.lido.core.leaf.lido.LidoDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LidoWrapDAOImpl implements LidoWrapDAO {
    private static LidoDAO lidoParserDAOImpl = new LidoDAOImpl();

    public LidoWrap getLidoWrap(Node node) {
        List<Lido> lidoList = new ArrayList<Lido>();
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:lido")) {
                lidoList.add(lidoParserDAOImpl.getLido(child));
            }
        }

        return new LidoWrap(
                lidoList,
                new LidoRelatedEncoding(attributes.get("lido:relatedencoding"))
        );
    }
}
