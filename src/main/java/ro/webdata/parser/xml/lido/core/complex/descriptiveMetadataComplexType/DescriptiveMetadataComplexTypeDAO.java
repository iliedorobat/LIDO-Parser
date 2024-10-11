package ro.webdata.parser.xml.lido.core.complex.descriptiveMetadataComplexType;

import org.w3c.dom.Node;

public interface DescriptiveMetadataComplexTypeDAO {
    /**
     *
     * @param node <b>lido:descriptiveMetadataComplexType</b> node type.
     * @return <b>DescriptiveMetadataComplexType</b>
     */
	DescriptiveMetadataComplexType getDescriptiveMetadataComplexType(Node node);
}
