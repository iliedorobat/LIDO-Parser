package ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata;

import ro.webdata.parser.xml.lido.core.complex.descriptiveMetadataComplexType.DescriptiveMetadataComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 *
 * @author WebData
 *
 */
public class DescriptiveMetadata extends DescriptiveMetadataComplexType {
	public DescriptiveMetadata() {}

	public DescriptiveMetadata(DescriptiveMetadataComplexType descriptiveMetadataComplexType) {
		super(
			descriptiveMetadataComplexType.getObjectClassificationWrap(),
			descriptiveMetadataComplexType.getObjectIdentificationWrap(),
			descriptiveMetadataComplexType.getEventWrap(),
			descriptiveMetadataComplexType.getObjectRelationWrap(),
			descriptiveMetadataComplexType.getLang()
		);
	}
}
