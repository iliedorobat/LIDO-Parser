package ro.webdata.parser.xml.lido.core.leaf.recordSource;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The source of information in this record,
 * 		generally the repository or other institution.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b><br/>
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordSource extends LegalBodyRefComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public RecordSource() {}

	public RecordSource(LegalBodyRefComplexType legalBodyRefComplexType, LidoType type, LidoSortOrder sortOrder) {
		super(
			legalBodyRefComplexType.getLegalBodyID(),
			legalBodyRefComplexType.getLegalBodyName(),
			legalBodyRefComplexType.getLegalBodyWeblink()
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
