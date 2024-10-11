package ro.webdata.parser.xml.lido.core.leaf.subjectObject;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> An object - e.g. a building or a work of art depicted in or by an object / work,
 * 			or what it is about, provided as display and index elements.<br/>
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
public class SubjectObject extends ObjectSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectObject() {}

	public SubjectObject(ObjectSetComplexType objectSetComplexType, LidoSortOrder sortOrder) {
		super(
			objectSetComplexType.getDisplayObject(),
			objectSetComplexType.getObject()
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
