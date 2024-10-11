package ro.webdata.parser.xml.lido.core.leaf.subjectPlace;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectPlaceDAOImpl implements SubjectPlaceDAO {
    private static PlaceSetComplexTypeDAO placeSetComplexTypeDAO = new PlaceSetComplexTypeDAOImpl();

    public SubjectPlace getSubjectPlace(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new SubjectPlace(
                placeSetComplexTypeDAO.getPlaceSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
