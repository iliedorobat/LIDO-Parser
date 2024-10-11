package ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata;

import org.w3c.dom.Node;

public interface DescriptiveMetadataDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveMetadata</b> node type.
	 * @return <b>DescriptiveMetadata</b>
	 */
	DescriptiveMetadata getDescriptiveMetadata(Node node);
}
