package ro.webdata.parser.xml.lido.core.set.titleSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;

import java.util.Map;

public class TitleSetDAOImpl implements TitleSetDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public TitleSet getTitleSet(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new TitleSet(
                appellationComplexTypeDAO.getAppellationComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
