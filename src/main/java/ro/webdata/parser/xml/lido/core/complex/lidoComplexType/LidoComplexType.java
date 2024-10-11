package ro.webdata.parser.xml.lido.core.complex.lidoComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.attribute.LidoRelatedEncoding;
import ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata.AdministrativeMetadata;
import ro.webdata.parser.xml.lido.core.leaf.category.Category;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata.DescriptiveMetadata;
import ro.webdata.parser.xml.lido.core.leaf.lidoRecID.LidoRecID;
import ro.webdata.parser.xml.lido.core.leaf.objectPublishedID.ObjectPublishedID;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Holds the metadata of an object / work.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>lidoRecID: (lido:identifierComplexType 1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique lido record identification preferably composed of an identifier
 *    		for the contributor and a record identification in the contributor's (local) system.
 * 			</div>
 * 			<b>objectPublishedID: (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique, published identification of the described object / work.<br/>
 *  			<b>How to record:</b> May link to authority files maintained outside of the contributor's
 *   			documentation system or may be an identifier for the object published by its repository,
 *    		e.g. composed of an identifier for the repository and an inventory number of the object.
 * 			</div>
 * 			<b>category: (lido:conceptComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Indicates the category of which this item is an instance, preferably
 *  			referring to CIDOC-CRM concept definitions.<br/>
 *   			<b>How to record:</b> CIDOC-CRM concept definitions are given at
 *    		http://www.cidoc-crm.org/crm-concepts/Data values in the sub-element term may often be:
 *    		Man-Made Object (with conceptID "http://www.cidoc-crm.org/crm-concepts/E22"),
 *    		Man-Made Feature (http://www.cidoc-crm.org/crm-concepts/E25),
 *    		Collection (http://www.cidoc-crm.org/crm-concepts/E78).
 * 			</div>
 * 			<b>descriptiveMetadata: (lido:descriptiveMetadataComplexType 1-unbounded)</b><br/>
 * 			<b>administrativeMetadata: (lido:administrativeMetadataComplexType 1-unbounded)</b>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>relatedencoding (lido:relatedencoding)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoComplexType {
	private ArrayList<LidoRecID> lidoRecID;
	private ArrayList<ObjectPublishedID> objectPublishedID;
	private Category category;
	private ArrayList<DescriptiveMetadata> descriptiveMetadata;
	private ArrayList<AdministrativeMetadata> administrativeMetadata;
	private LidoRelatedEncoding relatedEncoding;
	private PrintMessages printMessages = new PrintMessages();

	public LidoComplexType() {}

	public LidoComplexType(ArrayList<LidoRecID> lidoRecID, ArrayList<ObjectPublishedID> objectPublishedID,
			Category category, ArrayList<DescriptiveMetadata> descriptiveMetadata,
			ArrayList<AdministrativeMetadata> administrativeMetadata, LidoRelatedEncoding relatedencoding) {
		setLidoRecID(lidoRecID);
		setObjectPublishedID(objectPublishedID);
		setCategory(category);
		setDescriptiveMetadata(descriptiveMetadata);
		setAdministrativeMetadata(administrativeMetadata);
		setRelatedencoding(relatedencoding);

		if (lidoRecID == null || lidoRecID.isEmpty()) {
			printMessages.printEmptyArray(LidoComplexType.class, "lido:lidoRecID");
		}

		if (descriptiveMetadata == null || lidoRecID.isEmpty()) {
			printMessages.printEmptyArray(LidoComplexType.class, "lido:descriptiveMetadata");
		}

		if (administrativeMetadata == null || lidoRecID.isEmpty()) {
			printMessages.printEmptyArray(LidoComplexType.class, "lido:administrativeMetadata");
		}
	}

	public ArrayList<LidoRecID> getLidoRecID() {
		return lidoRecID;
	}

	public void setLidoRecID(ArrayList<LidoRecID> lidoRecID) {
		this.lidoRecID = lidoRecID;
	}

	public ArrayList<ObjectPublishedID> getObjectPublishedID() {
		return objectPublishedID;
	}

	public void setObjectPublishedID(ArrayList<ObjectPublishedID> objectPublishedID) {
		this.objectPublishedID = objectPublishedID;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ArrayList<DescriptiveMetadata> getDescriptiveMetadata() {
		return descriptiveMetadata;
	}

	public void setDescriptiveMetadata(ArrayList<DescriptiveMetadata> descriptiveMetadata) {
		this.descriptiveMetadata = descriptiveMetadata;
	}

	public ArrayList<AdministrativeMetadata> getAdministrativeMetadata() {
		return administrativeMetadata;
	}

	public void setAdministrativeMetadata(ArrayList<AdministrativeMetadata> administrativeMetadata) {
		this.administrativeMetadata = administrativeMetadata;
	}

	public LidoRelatedEncoding getRelatedencoding() {
		return relatedEncoding;
	}

	public void setRelatedencoding(LidoRelatedEncoding relatedencoding) {
		this.relatedEncoding = relatedencoding;
	}
}
