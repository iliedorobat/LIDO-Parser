package ro.webdata.parser.xml.lido.core.leaf.recordSource;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;

import java.util.Map;

public class RecordSourceDAOImpl implements RecordSourceDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RecordSource getRecordSourceType(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new RecordSource(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
