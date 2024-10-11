package ro.webdata.parser.xml.lido.core.leaf.objectWorkType;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

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
