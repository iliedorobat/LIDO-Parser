package ro.webdata.parser.xml.lido.core.wrap.resourceWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSet;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for resources that are surrogates for an object / work,
 * 		including digital images, videos or audio files that represent it in an online service.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>resourceSet: (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Contains sub-elements for a structured resource description.<br/>
 * 				<b>Notes:</b> Provides identification of a surrogate of the object / work including
 * 				digital images, slides, transparencies, photographs, audio, video and moving images,
 * 				but excluding items that are considered object / works in their own right. For such
 * 				as drawings, prints, paintings, or photographs considered art, and other works that
 * 				themselves contain representations of other works, use Related Works and/or Subjects.
 * 			</div>
 * 		</div>
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceWrap {
	private ArrayList<ResourceSet> resourceSetList;

	public ResourceWrap() {}

	public ResourceWrap(ArrayList<ResourceSet> resourceSetList) {
		setResourceSet(resourceSetList);
	}

	public ArrayList<ResourceSet> getResourceSet() {
		return resourceSetList;
	}

	public void setResourceSet(ArrayList<ResourceSet> resourceSetList) {
		this.resourceSetList = resourceSetList;
	}
}
