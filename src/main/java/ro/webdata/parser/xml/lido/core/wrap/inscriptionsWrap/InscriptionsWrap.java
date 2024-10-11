package ro.webdata.parser.xml.lido.core.wrap.inscriptionsWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.inscriptions.Inscriptions;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for information about inscriptions and other marks.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>inscriptions (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A transcription or description of any distinguishing or identifying
 * 				physical lettering, annotations, texts, markings, or labels that are affixed, applied,
 * 				stamped, written, inscribed, or attached to the object / work, excluding any mark or text
 * 				inherent in the materials of which it is made.<br/>
 * 				<b>Notes:</b> Record watermarks in Display Materials/Techniques.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class InscriptionsWrap {
	private ArrayList<Inscriptions> inscriptions;

	public InscriptionsWrap() {}

	public InscriptionsWrap(ArrayList<Inscriptions> inscriptions) {
		setInscriptions(inscriptions);
	}

	public ArrayList<Inscriptions> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(ArrayList<Inscriptions> inscriptions) {
		this.inscriptions = inscriptions;
	}
}
