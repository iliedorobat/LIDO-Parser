package ro.webdata.parser.xml.lido.core.leaf.linkResource;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoCodecResource;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;

import java.util.Map;

public class LinkResourceDAOImpl implements LinkResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public LinkResource getLinkResource(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new LinkResource(
                webResourceComplexTypeDAO.getWebResourceComplexType(node),
                new LidoCodecResource(attributes.get("lido:codecResource"))
        );
    }
}
