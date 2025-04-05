package ro.webdata.parser.xml.lido.core.leaf.recordMetadataDate;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSource;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

import java.util.Map;

public class RecordMetadataDateDAOImpl implements RecordMetadataDateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public RecordMetadataDate getRecordMetadataDate(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new RecordMetadataDate(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSource(attributes.get("lido:source"))
        );
    }
}
