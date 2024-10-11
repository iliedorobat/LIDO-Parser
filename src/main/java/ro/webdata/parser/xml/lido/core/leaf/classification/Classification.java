package ro.webdata.parser.xml.lido.core.leaf.classification;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Concepts used to categorize an object / work by grouping it
 * 			together with others on the basis of similar characteristics.<br/>
 * 			<b>How to record:</b> The category belongs to a systematic scheme (classification)
 * 			which groups objects of similar characteristics according to uniform aspects. This
 * 			grouping / classification may be done according to material, form, shape, function,
 * 			region of origin, cultural context, or historical or stylistic period. In addition
 * 			to this systematic grouping it may also be done according to organizational divisions
 * 			within a museum (e.g., according to the collection structure of a museum). If the
 * 			object / work is assigned to multiple classifications, repeat this element. Preferably
 * 			taken from a published controlled vocabulary.<br/>
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
public class Classification extends ConceptComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public Classification() {}

	public Classification(ConceptComplexType conceptComplexType, LidoType type, LidoSortOrder sortOrder) {
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
