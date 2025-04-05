package ro.webdata.parser.xml.lido.core.complex.lidoComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoRelatedEncoding;
import ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata.AdministrativeMetadata;
import ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata.AdministrativeMetadataDAO;
import ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata.AdministrativeMetadataDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.category.Category;
import ro.webdata.parser.xml.lido.core.leaf.category.CategoryDAO;
import ro.webdata.parser.xml.lido.core.leaf.category.CategoryDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata.DescriptiveMetadata;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata.DescriptiveMetadataDAO;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata.DescriptiveMetadataDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.lidoRecID.LidoRecID;
import ro.webdata.parser.xml.lido.core.leaf.lidoRecID.LidoRecIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.lidoRecID.LidoRecIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.objectPublishedID.ObjectPublishedID;
import ro.webdata.parser.xml.lido.core.leaf.objectPublishedID.ObjectPublishedIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.objectPublishedID.ObjectPublishedIDDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LidoComplexTypeDAOImpl implements LidoComplexTypeDAO {
    private static LidoRecIDDAO lidoRecIDParser = new LidoRecIDDAOImpl();
    private static ObjectPublishedIDDAO objectPublishedIDParser = new ObjectPublishedIDDAOImpl();
    private static CategoryDAO categoryParser = new CategoryDAOImpl();
    private static DescriptiveMetadataDAO descriptiveMetadataParser = new DescriptiveMetadataDAOImpl();
    private static AdministrativeMetadataDAO administrativeMetadataParser = new AdministrativeMetadataDAOImpl();

    public LidoComplexType getLidoComplexType(Node node) {
        List<LidoRecID> lidoRecIDList = new ArrayList<LidoRecID>();
        List<ObjectPublishedID> objectPublishedIDList = new ArrayList<ObjectPublishedID>();
        Category category = null;
        List<DescriptiveMetadata> descriptiveMetadataList = new ArrayList<DescriptiveMetadata>();
        List<AdministrativeMetadata> administrativeMetadataList = new ArrayList<AdministrativeMetadata>();
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:lidoRecID":
                    lidoRecIDList.add(lidoRecIDParser.getLidoRecID(child));
                    break;
                case "lido:objectPublishedID":
                    objectPublishedIDList.add(objectPublishedIDParser.getObjectPublishedID(child));
                    break;
                case "lido:category":
                    category = categoryParser.getCategory(child);
                    break;
                case "lido:descriptiveMetadata":
                    descriptiveMetadataList.add(descriptiveMetadataParser.getDescriptiveMetadata(child));
                    break;
                case "lido:administrativeMetadata":
                    administrativeMetadataList.add(administrativeMetadataParser.getAdministrativeMetadata(child));
                    break;
                default: break;
            }
        }

        return new LidoComplexType(
                lidoRecIDList, objectPublishedIDList, category,
                descriptiveMetadataList, administrativeMetadataList,
                new LidoRelatedEncoding(attributes.get("lido:relatedencoding"))
        );
    }
}
