package ro.webdata.parser.xml.lido.core.leaf.resourceSource;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Identification of the agency, individual, or repository from which the
 * 			image or other resource was obtained.<br/>
 * 			<b>How to record:</b> Include this sub-element when the source of the image/resource differs
 * 			from the source named in Record Source.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b><br/>
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceSource extends LegalBodyRefComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public ResourceSource() {}

	public ResourceSource(LegalBodyRefComplexType legalBodyRefComplexType, LidoType type, LidoSortOrder sortOrder) {
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
