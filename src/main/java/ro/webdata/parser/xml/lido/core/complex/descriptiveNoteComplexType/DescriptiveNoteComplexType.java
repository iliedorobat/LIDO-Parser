package ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID.DescriptiveNoteID;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteValue.DescriptiveNoteValue;
import ro.webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote.SourceDescriptiveNote;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for a description, including description identifer,
 * 		descriptive note and sources.<br/>
 * 		<b>How to record:</b> If there is more than one descriptive note, repeat this set.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>descriptiveNoteID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Identifier for an external resource describing the entity.<br/>
 * 				<b>Notes:</b> The referenced resource may be any kind of document, preferably web-accessible.
 * 			</div>
 * 			<b>descriptiveNoteValue (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Usually a relatively brief essay-like text that describes the entity.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>sourceDescriptiveNote (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The source for the descriptive note, generally a published source.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>lido:type (lido:type)</b><br/>
 * 			<b>lido:sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DescriptiveNoteComplexType {
	private List<DescriptiveNoteID> descriptiveNoteID;
	private List<DescriptiveNoteValue> descriptiveNoteValue;
	private List<SourceDescriptiveNote> sourceDescriptiveNote;
	private LidoType type;
	private LidoSortOrder sortOrder;

	public DescriptiveNoteComplexType() {}

	public DescriptiveNoteComplexType(List<DescriptiveNoteID> descriptiveNoteID,
			List<DescriptiveNoteValue> descriptiveNoteValue,
			List<SourceDescriptiveNote> sourceDescriptiveNote,
			LidoType type, LidoSortOrder sortOrder) {
		setDescriptiveNoteID(descriptiveNoteID);
		setDescriptiveNoteValue(descriptiveNoteValue);
		setSourceDescriptiveNote(sourceDescriptiveNote);
		setType(type);
		setSortOrder(sortOrder);
	}

	public List<DescriptiveNoteID> getDescriptiveNoteID() {
		return descriptiveNoteID;
	}

	public void setDescriptiveNoteID(List<DescriptiveNoteID> descriptiveNoteID) {
		this.descriptiveNoteID = descriptiveNoteID;
	}

	public List<DescriptiveNoteValue> getDescriptiveNoteValue() {
		return descriptiveNoteValue;
	}

	public void setDescriptiveNoteValue(List<DescriptiveNoteValue> descriptiveNoteValue) {
		this.descriptiveNoteValue = descriptiveNoteValue;
	}

	public List<SourceDescriptiveNote> getSourceDescriptiveNote() {
		return sourceDescriptiveNote;
	}

	public void setSourceDescriptiveNote(List<SourceDescriptiveNote> sourceDescriptiveNote) {
		this.sourceDescriptiveNote = sourceDescriptiveNote;
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
