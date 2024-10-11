package ro.webdata.parser.xml.lido.core.set.titleSet;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for one title or object name and its source information.<br/>
 * 		<b>How to record:</b> Mandatory. If there is no specific title, provide an object name in
 * 		the appellation value. If there is more than one title, repeat the Title Set element.<br/>
 * 		<b>Notes:</b> For objects from natural, technical, cultural history e.g. the object name
 * 		given here and the object type, recorded in the object / work type element are often identical.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b><br/>
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class TitleSet extends AppellationComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public TitleSet() {}

	public TitleSet(AppellationComplexType appellation, LidoType type, LidoSortOrder sortOrder) {
		super(
			appellation.getAppellationValue(),
			appellation.getSourceAppellation()
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
