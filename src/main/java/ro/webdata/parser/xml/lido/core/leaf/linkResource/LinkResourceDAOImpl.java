package ro.webdata.parser.xml.lido.core.leaf.linkResource;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoCodecResource;
import org.w3c.dom.Node;

import java.util.HashMap;

public class LinkResourceDAOImpl implements LinkResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public LinkResource getLinkResource(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new LinkResource(
                webResourceComplexTypeDAO.getWebResourceComplexType(node),
                new LidoCodecResource(attributes.get("lido:codecResource"))
        );
    }
}
