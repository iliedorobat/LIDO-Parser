package ro.webdata.parser.xml.lido.core.leaf.lido;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.lidoComplexType.LidoComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.lidoComplexType.LidoComplexTypeDAOImpl;

import java.util.Map;

public class LidoDAOImpl implements LidoDAO {
    private static LidoComplexTypeDAO lidoComplexTypeDAO = new LidoComplexTypeDAOImpl();

    public Lido getLido(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new Lido(
                lidoComplexTypeDAO.getLidoComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
