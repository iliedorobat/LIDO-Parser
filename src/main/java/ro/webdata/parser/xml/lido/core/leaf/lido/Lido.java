package ro.webdata.parser.xml.lido.core.leaf.lido;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.lidoComplexType.LidoComplexType;
import ro.webdata.parser.xml.lido.core.leaf.administrativeMetadata.AdministrativeMetadata;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata.DescriptiveMetadata;
import ro.webdata.parser.xml.lido.core.leaf.lidoRecID.LidoRecID;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**
 * <link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Holds the metadata of an object / work.<br/>
 * 		<b>How to record:</b> Record attribute relatedencoding for this element only if it is the root element.
 * 		If the document holds more than one LIDO record, assign the attribute to the lidoWrap element.<br/>
 * 		<b>Notes:</b> Use this element as root for the delivery of content through OAI-PMH.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>sortorder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Lido extends LidoComplexType {
	private LidoSortOrder sortorder;
	private PrintMessages printMessages = new PrintMessages();

	public Lido() {}

	public Lido(LidoComplexType lidoComplexType, LidoSortOrder sortorder) {
		super(
			lidoComplexType.getLidoRecID(),
			lidoComplexType.getObjectPublishedID(),
			lidoComplexType.getCategory(),
			lidoComplexType.getDescriptiveMetadata(),
			lidoComplexType.getAdministrativeMetadata(),
			lidoComplexType.getRelatedencoding()
		);
		setSortorder(sortorder);

		ArrayList<LidoRecID> lidoRecID = lidoComplexType.getLidoRecID();
		ArrayList<DescriptiveMetadata> descriptiveMetadata = lidoComplexType.getDescriptiveMetadata();
		ArrayList<AdministrativeMetadata> administrativeMetadata = lidoComplexType.getAdministrativeMetadata();

		if (lidoRecID == null || lidoRecID.isEmpty()) {
			printMessages.printEmptyArray(LidoComplexType.class, "lido:lidoRecID");
		}

		if (descriptiveMetadata == null || descriptiveMetadata.isEmpty()) {
			printMessages.printEmptyArray(LidoComplexType.class, "lido:descriptiveMetadata");
		}

		if (administrativeMetadata == null || administrativeMetadata.isEmpty()) {
			printMessages.printEmptyArray(LidoComplexType.class, "lido:administrativeMetadata");
		}
	}

	public LidoSortOrder getSortorder() {
		return sortorder;
	}

	public void setSortorder(LidoSortOrder sortorder) {
		this.sortorder = sortorder;
	}
}
