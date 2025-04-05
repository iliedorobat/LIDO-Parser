package ro.webdata.parser.xml.lido.core.leaf.inscriptions;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescription;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscription;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A transcription or description of any distinguishing or
 * 		identifying physical lettering, annotations, texts, markings, or labels that
 * 		are affixed, applied, stamped, written, inscribed, or attached to the object /
 * 		work, excluding any mark or text inherent in the materials of which it is made.<br/>
 * 		<b>Notes:</b> Record watermarks in Display Materials/Techniques.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>inscriptionTranscription (0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Transcription of the inscription.<br/>
 * 				<b>How to redord:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>inscriptionDescription (0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for a description of the inscription, including description
 * 				identifer, descriptive note of the inscription and sources.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b><br/>
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Inscriptions {
	private List<InscriptionTranscription> inscriptionTranscription;
	private List<InscriptionDescription> inscriptionDescription;
	private LidoType type;
	private LidoSortOrder sortOrder;

	public Inscriptions() {}

	public Inscriptions(List<InscriptionTranscription> inscriptionTranscription,
			List<InscriptionDescription> inscriptionDescription,
			LidoType type, LidoSortOrder sortOrder) {
		setInscriptionTranscription(inscriptionTranscription);
		setInscriptionDescription(inscriptionDescription);
		setType(type);
		setSortOrder(sortOrder);
	}

	public List<InscriptionTranscription> getInscriptionTranscription() {
		return inscriptionTranscription;
	}

	public void setInscriptionTranscription(List<InscriptionTranscription> inscriptionTranscription) {
		this.inscriptionTranscription = inscriptionTranscription;
	}

	public List<InscriptionDescription> getInscriptionDescription() {
		return inscriptionDescription;
	}

	public void setInscriptionDescription(List<InscriptionDescription> inscriptionDescription) {
		this.inscriptionDescription = inscriptionDescription;
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
