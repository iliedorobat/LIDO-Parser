package ro.webdata.parser.xml.lido.core.complex.termComplexType;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.attribute.LidoAddedSearchTerm;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoPref;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TermComplexTypeDAOImpl implements TermComplexTypeDAO {
    private static Utils utils = new Utils();

    public TermComplexType getTermComplexType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

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