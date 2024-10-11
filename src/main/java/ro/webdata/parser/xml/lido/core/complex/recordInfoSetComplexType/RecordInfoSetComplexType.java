package ro.webdata.parser.xml.lido.core.complex.recordInfoSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoID.RecordInfoID;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoLink.RecordInfoLink;
import ro.webdata.parser.xml.lido.core.leaf.recordMetadataDate.RecordMetadataDate;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for metadata information about this record.<br/>
 * 		<b>Notes:</b> The metadata information contains the reference
 * 		to the "lido"-metadata set but may also be constituted by
 * 		reference to an "object data sheet" in an online database.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>recordInfoID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Unique ID of the metadata.<br/>
 * 				<b>How to record:</b> Record Info ID has the same definition as
 * 				Record ID but out of the context of original local system, such
 * 				as a persistent identifier or an oai identifier (e.g.,
 * 				oai1:getty.edu:paintings/00001234 attribute type= oai).
 * 			</div>
 * 			<b>recordInfoLink (lido:webResourceComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Link of the metadata, e.g., to the object data
 * 				sheet (not the same as link of the object).
 * 			</div>
 * 			<b>recordMetadataDate (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Creation date or date modified of the metadata record.
 * 				Format will vary depending upon implementation.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordInfoSetComplexType {
	private ArrayList<RecordInfoID> recordInfoID;
	private ArrayList<RecordInfoLink> recordInfoLink;
	private ArrayList<RecordMetadataDate> recordMetadataDate;
	private LidoType type;

	public RecordInfoSetComplexType() {}

	public RecordInfoSetComplexType(ArrayList<RecordInfoID> recordInfoID, ArrayList<RecordInfoLink> recordInfoLink,
			ArrayList<RecordMetadataDate> recordMetadataDate, LidoType type) {
		setRecordInfoID(recordInfoID);
		setRecordInfoLink(recordInfoLink);
		setRecordMetadataDate(recordMetadataDate);
		setType(type);
	}

	public ArrayList<RecordInfoID >getRecordInfoID() {
		return recordInfoID;
	}

	public void setRecordInfoID(ArrayList<RecordInfoID> recordInfoID) {
		this.recordInfoID = recordInfoID;
	}

	public ArrayList<RecordInfoLink> getRecordInfoLink() {
		return recordInfoLink;
	}

	public void setRecordInfoLink(ArrayList<RecordInfoLink> recordInfoLink) {
		this.recordInfoLink = recordInfoLink;
	}

	public ArrayList<RecordMetadataDate> getRecordMetadataDate() {
		return recordMetadataDate;
	}

	public void setRecordMetadataDate(ArrayList<RecordMetadataDate> recordMetadataDate) {
		this.recordMetadataDate = recordMetadataDate;
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}
}
