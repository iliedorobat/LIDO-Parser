package ro.webdata.parser.xml.lido.core.set.resourceSet;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.resourceSetComplexType.ResourceSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Contains sub-elements for a structured resource description.<br/>
 * 		<b>Notes:</b> Provides identification of a surrogate of the object / work including digital
 * 		images, slides, transparencies, photographs, audio, video and moving images, but excluding
 * 		items that are considered object / works in their own right. For such as drawings, prints,
 * 		paintings, or photographs considered art, and other works that themselves contain representations
 * 		of other works, use Related Works and/or Subjects.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceSet extends ResourceSetComplexType {
	private LidoSortOrder sortOrder;

	public ResourceSet() {}

	public ResourceSet(ResourceSetComplexType resourceSetComplexType, LidoSortOrder sortOrder) {
		super(
			resourceSetComplexType.getResourceID(),
			resourceSetComplexType.getResourceRepresentation(),
			resourceSetComplexType.getResourceType(),
			resourceSetComplexType.getResourceRelType(),
			resourceSetComplexType.getResourcePerspective(),
			resourceSetComplexType.getResourceDescription(),
			resourceSetComplexType.getResourceDateTaken(),
			resourceSetComplexType.getResourceSource(),
			resourceSetComplexType.getRightsResource()
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
