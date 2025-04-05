package ro.webdata.parser.xml.lido.core.wrap.recordWrap;

import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.leaf.recordID.RecordID;
import ro.webdata.parser.xml.lido.core.leaf.recordRights.RecordRights;
import ro.webdata.parser.xml.lido.core.leaf.recordSource.RecordSource;
import ro.webdata.parser.xml.lido.core.leaf.recordType.RecordType;
import ro.webdata.parser.xml.lido.core.set.recordInfoSet.RecordInfoSet;
import ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrap;

import java.util.List;

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
	private List<RecordID> recordID;
	private RecordType recordType;
	private List<RecordSource> recordSource;
	private List<RecordRights> recordRights;
	private List<RecordInfoSet> recordInfoSet;
	private PrintMessages printMessages = new PrintMessages();

	public RecordWrap() {}

	public RecordWrap(List<RecordID> recordID, RecordType recordType, List<RecordSource> recordSource,
			List<RecordRights> recordRights, List<RecordInfoSet> recordInfoSet) {
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

	public List<RecordID> getRecordID() {
		return recordID;
	}

	public void setRecordID(List<RecordID> recordID) {
		this.recordID = recordID;
	}

	public RecordType getRecordType() {
		return recordType;
	}

	public void setRecordType(RecordType recordType) {
		this.recordType = recordType;
	}

	public List<RecordSource> getRecordSource() {
		return recordSource;
	}

	public void setRecordSource(List<RecordSource> recordSource) {
		this.recordSource = recordSource;
	}

	public List<RecordRights> getRecordRights() {
		return recordRights;
	}

	public void setRecordRights(List<RecordRights> recordRights) {
		this.recordRights = recordRights;
	}

	public List<RecordInfoSet> getRecordInfoSet() {
		return recordInfoSet;
	}

	public void setRecordInfoSet(List<RecordInfoSet> recordInfoSet) {
		this.recordInfoSet = recordInfoSet;
	}
}
