package ro.webdata.parser.xml.lido.core.complex.conceptComplexType;

import ro.webdata.parser.xml.lido.core.leaf.conceptID.ConceptID;
import ro.webdata.parser.xml.lido.core.leaf.term.Term;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Set for identifiers and terms of a concept.<br/>
 * 		<b>How to record:</b> A concept describes a conceptual resource. Concepts are
 * 		organized in concept schemes like thesauri, classification schemes, taxonomies,
 * 		subject-heading systems, or any other type of structured controlled vocabulary.
 * 		See also SKOS specifications at <a href="http://www.w3.org/2004/02/skos/">
 * 		http://www.w3.org/2004/02/skos/</a><br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>conceptID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A unique identifier for the concept.<br/>
 * 				<b>How to record:</b> Preferably taken from and linking to a published controlled vocabulary.
 * 			</div>
 * 			<b>term (lido:termComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A name for the referred concept, used for indexing.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ConceptComplexType {
	private List<ConceptID> conceptID;
	private List<Term> term;

	public ConceptComplexType() {}

	public ConceptComplexType(List<ConceptID> conceptID, List<Term> term) {
		setConceptID(conceptID);
		setTerm(term);
	}

	public List<ConceptID> getConceptID() {
		return conceptID;
	}

	public void setConceptID(List<ConceptID> conceptID) {
		this.conceptID = conceptID;
	}

	public List<Term> getTerm() {
		return term;
	}

	public void setTerm(List<Term> term) {
		this.term = term;
	}
}
