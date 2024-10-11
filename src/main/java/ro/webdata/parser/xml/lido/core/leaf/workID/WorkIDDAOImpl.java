package ro.webdata.parser.xml.lido.core.leaf.workID;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class WorkIDDAOImpl implements WorkIDDAO {
    public WorkID getWorkID(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new WorkID(
                node.getTextContent(),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get(" lido:sortorder")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
