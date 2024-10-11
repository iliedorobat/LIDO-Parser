package ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription;

import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for a description of the inscription, including
 * 		description identifer, descriptive note of the inscription and sources.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class InscriptionDescription extends DescriptiveNoteComplexType {
	public InscriptionDescription() {}

	public InscriptionDescription(DescriptiveNoteComplexType descriptiveNoteComplexType) {
		super(
			descriptiveNoteComplexType.getDescriptiveNoteID(),
			descriptiveNoteComplexType.getDescriptiveNoteValue(),
			descriptiveNoteComplexType.getSourceDescriptiveNote(),
			descriptiveNoteComplexType.getType(),
			descriptiveNoteComplexType.getSortOrder()
		);
	}
}
