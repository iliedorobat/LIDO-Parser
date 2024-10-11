package ro.webdata.parser.xml.lido.core.set.objectDescriptionSet;

import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for a description of the object, including
 * 		description identifer, descriptive note and sources.<br/>
 * 		<b>How to record:</b> Includes usually a relatively brief essay-like
 * 		text that describes the content and context of the object / work,
 * 		including comments and an interpretation that may supplement, qualify,
 * 		or explain the physical characteristics, subject, circumstances of
 * 		creation or discovery, or other information about it.If there is more
 * 		than one descriptive note, repeat this element.<br/>
 * 		<b>Notes:</b> A reference to a text resource holding the description
 * 		may be given in description identifier.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectDescriptionSet extends DescriptiveNoteComplexType {
	public ObjectDescriptionSet() {}

	public ObjectDescriptionSet(DescriptiveNoteComplexType descriptiveNoteComplexType) {
		super(
			descriptiveNoteComplexType.getDescriptiveNoteID(),
			descriptiveNoteComplexType.getDescriptiveNoteValue(),
			descriptiveNoteComplexType.getSourceDescriptiveNote(),
			descriptiveNoteComplexType.getType(),
			descriptiveNoteComplexType.getSortOrder()
		);
	}
}
