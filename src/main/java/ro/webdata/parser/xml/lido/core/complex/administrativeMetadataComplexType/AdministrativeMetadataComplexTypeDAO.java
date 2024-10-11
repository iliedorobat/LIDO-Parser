package ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType;

import org.w3c.dom.Node;

public interface AdministrativeMetadataComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:administrativeMetadata</b> node type.
	 * @return <b>AdministrativeMetadataComplexType</b>
	 */
	AdministrativeMetadataComplexType getAdministrativeMetadataComplexType(Node node);
}
