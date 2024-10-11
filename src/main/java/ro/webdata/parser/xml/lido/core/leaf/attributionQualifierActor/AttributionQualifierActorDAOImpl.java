package ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class AttributionQualifierActorDAOImpl implements AttributionQualifierActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public AttributionQualifierActor getAttributionQualifierActor(Node node) {
        return new AttributionQualifierActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
