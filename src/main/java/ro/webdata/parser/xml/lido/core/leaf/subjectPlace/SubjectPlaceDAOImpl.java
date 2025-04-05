package ro.webdata.parser.xml.lido.core.leaf.subjectPlace;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAOImpl;

import java.util.Map;

public class SubjectPlaceDAOImpl implements SubjectPlaceDAO {
    private static PlaceSetComplexTypeDAO placeSetComplexTypeDAO = new PlaceSetComplexTypeDAOImpl();

    public SubjectPlace getSubjectPlace(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new SubjectPlace(
                placeSetComplexTypeDAO.getPlaceSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
