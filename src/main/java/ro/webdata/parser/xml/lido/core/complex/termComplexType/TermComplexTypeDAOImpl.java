package ro.webdata.parser.xml.lido.core.complex.termComplexType;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.*;

import java.util.Map;

public class TermComplexTypeDAOImpl implements TermComplexTypeDAO {
    public TermComplexType getTermComplexType(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new TermComplexType(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new LidoAddedSearchTerm(attributes.get("lido:addedSearchTerm")),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
