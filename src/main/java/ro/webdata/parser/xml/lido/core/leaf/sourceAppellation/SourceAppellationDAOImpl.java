package ro.webdata.parser.xml.lido.core.leaf.sourceAppellation;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;

import java.util.Map;

public class SourceAppellationDAOImpl implements SourceAppellationDAO {
    public SourceAppellation getSourceAppellation(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new SourceAppellation(
                node.getTextContent(),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
