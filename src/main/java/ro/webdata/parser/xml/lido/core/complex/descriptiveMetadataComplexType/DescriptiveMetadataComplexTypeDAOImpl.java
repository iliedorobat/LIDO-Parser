package ro.webdata.parser.xml.lido.core.complex.descriptiveMetadataComplexType;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.wrap.eventWrap.EventWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap.ObjectClassificationWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.objectIdentificationWrap.ObjectIdentificationWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap.ObjectRelationWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.eventWrap.EventWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap.ObjectClassificationWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.objectIdentificationWrap.ObjectIdentificationWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap.ObjectRelationWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import ro.webdata.parser.xml.lido.core.wrap.eventWrap.EventWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap.ObjectClassificationWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectIdentificationWrap.ObjectIdentificationWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap.ObjectRelationWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class DescriptiveMetadataComplexTypeDAOImpl implements DescriptiveMetadataComplexTypeDAO {
    private static ObjectClassificationWrapDAO objectClassificationWrapDAO = new ObjectClassificationWrapDAOImpl();
    private static ObjectIdentificationWrapDAO objectIdentificationWrapDAO = new ObjectIdentificationWrapDAOImpl();
    private static EventWrapDAO eventWrapDAO = new EventWrapDAOImpl();
    private static ObjectRelationWrapDAO objectRelationWrapDAO = new ObjectRelationWrapDAOImpl();

    public DescriptiveMetadataComplexType getDescriptiveMetadataComplexType(Node node) {
        ObjectClassificationWrap objectClassificationWrap = new ObjectClassificationWrap();
        ObjectIdentificationWrap objectIdentificationWrap = new ObjectIdentificationWrap();
        EventWrap eventWrap = new EventWrap();
        ObjectRelationWrap objectRelationWrap = new ObjectRelationWrap();
        HashMap<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:objectClassificationWrap":
                    objectClassificationWrap = objectClassificationWrapDAO.getObjectClassificationWrap(child);
                    break;
                case "lido:objectIdentificationWrap":
                    objectIdentificationWrap = objectIdentificationWrapDAO.getObjectIdentificationWrap(child);
                    break;
                case "lido:eventWrap":
                    eventWrap = eventWrapDAO.getEventWrap(child);
                    break;
                case "lido:objectRelationWrap":
                    objectRelationWrap = objectRelationWrapDAO.getObjectRelationWrap(child);
                    break;
                default: break;
            }
        }

        return new DescriptiveMetadataComplexType(
                objectClassificationWrap,
                objectIdentificationWrap,
                eventWrap, objectRelationWrap,
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}
