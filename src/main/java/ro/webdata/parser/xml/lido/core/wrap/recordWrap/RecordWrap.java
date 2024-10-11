package ro.webdata.parser.xml.lido.core.wrap.recordWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrap;
import ro.webdata.parser.xml.lido.core.leaf.recordID.RecordID;
import ro.webdata.parser.xml.lido.core.leaf.recordRights.RecordRights;
import ro.webdata.parser.xml.lido.core.leaf.recordSource.RecordSource;
import ro.webdata.parser.xml.lido.core.leaf.recordType.RecordType;
import ro.webdata.parser.xml.lido.core.set.recordInfoSet.RecordInfoSet;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for information about the
 * 		record that contains the cataloguing information.<br/>
 * 		<b>Notes:</b> Note that this section does not refer to
 * 		any object or resource information, but only to the source
 * 		record.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>recordID (lido:identifierComplexType 1-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique record identification in the contributor's (local) system.
 * 			</div>
 * 			<b>recordType (lido:conceptComplexType 1)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Term establishing whether the record represents an
 * 				individual item or a collection, series, or group of works.<br/>
 * 				<b>How to record:</b> Mandatory. Example values: item, collection, series,
 * 				group, volume, fonds.Preferably taken from a published controlled value list.
 * 			</div>
 * 			<b>recordSource (1-unbounded)</b><br/>
 * 			<b>recordRights (0-unbounded)</b><br/>
 * 			<b>recordInfoSet (lido:recordInfoSetComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for metadata information about this record.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordWrap {
	private ArrayList<RecordID> recordID;
	private RecordType recordType;
	private ArrayList<RecordSource> recordSource;
	private ArrayList<RecordRights> recordRights;
	private ArrayList<RecordInfoSet> recordInfoSet;
	private PrintMessages printMessages = new PrintMessages();

	public RecordWrap() {}

	public RecordWrap(ArrayList<RecordID> recordID, RecordType recordType, ArrayList<RecordSource> recordSource,
			ArrayList<RecordRights> recordRights, ArrayList<RecordInfoSet> recordInfoSet) {
		setRecordID(recordID);
		setRecordType(recordType);
		setRecordSource(recordSource);
		setRecordRights(recordRights);
		setRecordInfoSet(recordInfoSet);

		if (recordID == null || recordID.isEmpty()) {
			printMessages.printEmptyArray(ObjectWorkTypeWrap.class, "lido:recordID");
		}

		if (recordType == null) {
			printMessages.printUndefinedNode(ObjectWorkTypeWrap.class, "lido:recordType");
		}

		if (recordSource == null || recordSource.isEmpty()) {
			printMessages.printEmptyArray(ObjectWorkTypeWrap.class, "lido:recordSource");
		}
	}

	public ArrayList<RecordID> getRecordID() {
		return recordID;
	}

	public void setRecordID(ArrayList<RecordID> recordID) {
		this.recordID = recordID;
	}

	public RecordType getRecordType() {
		return recordType;
	}

	public void setRecordType(RecordType recordType) {
		this.recordType = recordType;
	}

	public ArrayList<RecordSource> getRecordSource() {
		return recordSource;
	}

	public void setRecordSource(ArrayList<RecordSource> recordSource) {
		this.recordSource = recordSource;
	}

	public ArrayList<RecordRights> getRecordRights() {
		return recordRights;
	}

	public void setRecordRights(ArrayList<RecordRights> recordRights) {
		this.recordRights = recordRights;
	}

	public ArrayList<RecordInfoSet> getRecordInfoSet() {
		return recordInfoSet;
	}

	public void setRecordInfoSet(ArrayList<RecordInfoSet> recordInfoSet) {
		this.recordInfoSet = recordInfoSet;
	}
}
