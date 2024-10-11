package ro.webdata.parser.xml.lido.core.complex.textComplexType;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TextComplexTypeDAOImpl implements TextComplexTypeDAO {
    public TextComplexType getTextComplexType(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new TextComplexType(
                node.getTextContent(),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get(" lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
