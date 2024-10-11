package ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata;

import org.w3c.dom.Node;

public interface AdministrativeMetadataDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveMetadata</b> node type.
	 * @return <b>AdministrativeMetadata</b>
	 */
	AdministrativeMetadata getAdministrativeMetadata(Node node);
}
