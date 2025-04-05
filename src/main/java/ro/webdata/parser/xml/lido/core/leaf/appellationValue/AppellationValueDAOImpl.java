package ro.webdata.parser.xml.lido.core.leaf.appellationValue;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoPref;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;

import java.util.Map;

public class AppellationValueDAOImpl implements AppellationValueDAO {
    public AppellationValue getAppellationValue(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new AppellationValue(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
