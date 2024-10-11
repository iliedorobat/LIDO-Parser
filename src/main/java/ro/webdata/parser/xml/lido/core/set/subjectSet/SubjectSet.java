package ro.webdata.parser.xml.lido.core.set.subjectSet;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.subjectSetComplexType.SubjectSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for one set of subject information.<br/>
 * 		<b>How to record:</b> If an object / work has multiple parts or otherwise has separate,
 * 		multiple subjects, repeat this element and use Extent SubjectDAO in the SubjectDAO element.
 * 		This element may also be repeated to distinguish between subjects that reflect what an
 * 		object / work is *of* (description and identification) from what it is *about* (interpretation).<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SubjectSet extends SubjectSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectSet() {}

	public SubjectSet(SubjectSetComplexType subjectSetComplexType, LidoSortOrder sortOrder) {
		super(
			subjectSetComplexType.getDisplaySubject(),
			subjectSetComplexType.getSubject()
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
