package ro.webdata.parser.xml.lido.core.leaf.eventMethod;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The method by which the event is carried out.<br/>
 * 			<b>How to record:</b> Preferably taken from a published controlled vocabulary.<br/>
 * 			<b>Notes:</b> Used e.g. for SPECTRUM Units of Information "field collection method", "acquisition method".<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventMethod extends ConceptComplexType {
	private LidoSortOrder sortOrder;

	public EventMethod() {}

	public EventMethod(ConceptComplexType conceptComplexType, LidoSortOrder sortOrder) {
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
