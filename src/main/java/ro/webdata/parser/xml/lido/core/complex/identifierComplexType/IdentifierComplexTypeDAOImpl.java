package ro.webdata.parser.xml.lido.core.complex.identifierComplexType;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.*;

import java.util.Map;

public class IdentifierComplexTypeDAOImpl implements IdentifierComplexTypeDAO {
    public IdentifierComplexType getIdentifierComplexType(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new IdentifierComplexType(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new LidoType(attributes.get("lido:type")),
                new LidoSource(attributes.get("lido:source")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
