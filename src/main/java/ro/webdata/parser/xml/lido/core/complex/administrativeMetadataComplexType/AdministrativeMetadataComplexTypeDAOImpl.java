package ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import ro.webdata.parser.xml.lido.core.wrap.recordWrap.RecordWrap;
import ro.webdata.parser.xml.lido.core.wrap.recordWrap.RecordWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.recordWrap.RecordWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.resourceWrap.ResourceWrap;
import ro.webdata.parser.xml.lido.core.wrap.resourceWrap.ResourceWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.resourceWrap.ResourceWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap.RightsWorkWrap;
import ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap.RightsWorkWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap.RightsWorkWrapDAOImpl;

import java.util.Map;

public class AdministrativeMetadataComplexTypeDAOImpl implements AdministrativeMetadataComplexTypeDAO {
    private static RecordWrapDAO recordWrapDAO = new RecordWrapDAOImpl();
    private static ResourceWrapDAO resourceWrapDAO = new ResourceWrapDAOImpl();
    private static RightsWorkWrapDAO rightsWorkWrapDAO = new RightsWorkWrapDAOImpl();

    public AdministrativeMetadataComplexType getAdministrativeMetadataComplexType(Node node) {
        RightsWorkWrap rightsWorkWrap = null;
        RecordWrap recordWrap = null;
        ResourceWrap resourceWrap = null;
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:rightsWorkWrap":
                    rightsWorkWrap = rightsWorkWrapDAO.getRightsWorkWrapParser(child);
                    break;
                case "lido:recordWrap":
                    recordWrap = recordWrapDAO.getRecordWrap(child);
                    break;
                case "lido:resourceWrap":
                    resourceWrap = resourceWrapDAO.getResourceWrap(child);
                    break;
                default: break;
            }
        }

        return new AdministrativeMetadataComplexType(
                rightsWorkWrap,
                recordWrap,
                resourceWrap,
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}
