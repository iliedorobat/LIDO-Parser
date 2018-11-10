package app.java.parser.model.element.leaf.object;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The specific kind of object / work being described.<br/>
 * 			<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 			For a collection, include repeating instances for identifying all of or the most
 * 			important items in the collection.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b><br/>
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectWorkType extends ConceptComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public ObjectWorkType() {}

	public ObjectWorkType(ConceptComplexType conceptComplexType, LidoType type, LidoSortOrder sortOrder) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
		setType(type);
		setSortOrder(sortOrder);
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