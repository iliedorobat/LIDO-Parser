package ro.webdata.parser.xml.lido.core.leaf.subjectConcept;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Provides references to concepts related to the subject
 * 			of the described object / work. <br/>
 * 			<b>How to record:</b> May include iconography, themes from literature,
 * 			or generic terms describing the material world, or topics (e.g., concepts,
 * 			themes, or issues). However, references to people, dates, events, places,
 * 			objects are indicated in the the respective sub-elements SubjectDAO Actor Set,
 * 			SubjectDAO Date Set, SubjectDAO Event Set, SubjectDAO Place Set, and SubjectDAO Object Set.
 * 			Preferably taken from a published controlled vocabulary.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SubjectConcept extends ConceptComplexType {
	private LidoSortOrder sortOrder;

	public SubjectConcept() {}

	public SubjectConcept(ConceptComplexType conceptComplexType, LidoSortOrder sortOrder) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
		setSortOrder(sortOrder);
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
