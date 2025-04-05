package ro.webdata.parser.xml.lido.core.leaf.resourceRepresentation;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType.MeasurementsSetComplexType;
import ro.webdata.parser.xml.lido.core.leaf.linkResource.LinkResource;
import ro.webdata.parser.xml.lido.core.leaf.linkResource.LinkResourceDAO;
import ro.webdata.parser.xml.lido.core.leaf.linkResource.LinkResourceDAOImpl;
import ro.webdata.parser.xml.lido.core.set.resourceMeasurementsSet.ResourceMeasurementsSetDAO;
import ro.webdata.parser.xml.lido.core.set.resourceMeasurementsSet.ResourceMeasurementsSetDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ResourceRepresentationDAOImpl implements ResourceRepresentationDAO {
    private static LinkResourceDAO linkParser = new LinkResourceDAOImpl();
    private static ResourceMeasurementsSetDAO measureSetParser = new ResourceMeasurementsSetDAOImpl();

    //TODO: create the ResourceRepresentationCompelexTypeDAO (artificial class) to extend the class
    public ResourceRepresentation getResourceRepresentation(Node node) {
        LinkResource linkResource = null;
        List<MeasurementsSetComplexType> resourceMeasurementsSet = new ArrayList<MeasurementsSetComplexType>();
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:linkResource":
                    linkResource = linkParser.getLinkResource(child);
                    break;
                case "lido:resourceMeasurementsSet":
                    resourceMeasurementsSet.add(measureSetParser.getResourceMeasurementsSet(child));
                    break;
                default: break;
            }
        }

        return new ResourceRepresentation(
                linkResource,
                resourceMeasurementsSet,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
