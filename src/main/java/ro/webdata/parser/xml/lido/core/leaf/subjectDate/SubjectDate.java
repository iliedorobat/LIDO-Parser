package ro.webdata.parser.xml.lido.core.leaf.subjectDate;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A time specification depicted in or by an object / work,
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
public class SubjectDate extends DateSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectDate() {}

	public SubjectDate(DateSetComplexType dateSetComplexType, LidoSortOrder sortOrder) {
		super(
			dateSetComplexType.getDisplayDate(),
			dateSetComplexType.getDate()
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
