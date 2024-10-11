package ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata;

import ro.webdata.parser.xml.lido.core.complex.descriptiveMetadataComplexType.DescriptiveMetadataComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.descriptiveMetadataComplexType.DescriptiveMetadataComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DescriptiveMetadataDAOImpl implements DescriptiveMetadataDAO {
    private static DescriptiveMetadataComplexTypeDAO descriptiveMetadataComplexTypeDAO = new DescriptiveMetadataComplexTypeDAOImpl();

    public DescriptiveMetadata getDescriptiveMetadata(Node node) {
        return new DescriptiveMetadata(descriptiveMetadataComplexTypeDAO.getDescriptiveMetadataComplexType(node));
    }
}
