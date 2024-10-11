package ro.webdata.parser.xml.lido.core.complex.relatedEventSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.relatedEvent.RelatedEventDAO;
import ro.webdata.parser.xml.lido.core.leaf.relatedEventRelType.RelatedEventRelTypeDAO;
import ro.webdata.parser.xml.lido.core.leaf.relatedEvent.RelatedEventDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.relatedEventRelType.RelatedEventRelTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.relatedEvent.RelatedEvent;
import ro.webdata.parser.xml.lido.core.leaf.relatedEventRelType.RelatedEventRelType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RelatedEventSetComplexTypeDAOImpl implements RelatedEventSetComplexTypeDAO {
    private static RelatedEventDAO relatedEventParser = new RelatedEventDAOImpl();
    private static RelatedEventRelTypeDAO relatedEventRelTypeParser = new RelatedEventRelTypeDAOImpl();

    public RelatedEventSetComplexType getRelatedEventSetComplexType(Node node) {
        RelatedEvent relatedEvent = null;
        RelatedEventRelType relatedEventRelType = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:relatedEvent":
                    relatedEvent = relatedEventParser.getRelatedEvent(child);
                    break;
                case "lido:relatedEventRelType":
                    relatedEventRelType = relatedEventRelTypeParser.getRelatedEventRelType(child);
                    break;
                default: break;
            }
        }

        return new RelatedEventSetComplexType(relatedEvent, relatedEventRelType);
    }
}
