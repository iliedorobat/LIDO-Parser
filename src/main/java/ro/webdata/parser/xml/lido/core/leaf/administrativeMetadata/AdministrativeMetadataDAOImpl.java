package ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata;

import ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class AdministrativeMetadataDAOImpl implements AdministrativeMetadataDAO {
    private AdministrativeMetadataComplexTypeDAO administrativeMetadataComplexTypeDAO = new AdministrativeMetadataComplexTypeDAOImpl();

    public AdministrativeMetadata getAdministrativeMetadata(Node node) {
        return new AdministrativeMetadata(
                administrativeMetadataComplexTypeDAO.getAdministrativeMetadataComplexType(node)
        );
    }
}
