package ro.webdata.parser.xml.lido.core.complex.resourceSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.resourceDateTaken.ResourceDateTaken;
import ro.webdata.parser.xml.lido.core.leaf.resourceDescription.ResourceDescription;
import ro.webdata.parser.xml.lido.core.leaf.resourceID.ResourceID;
import ro.webdata.parser.xml.lido.core.leaf.resourcePerspective.ResourcePerspective;
import ro.webdata.parser.xml.lido.core.leaf.resourceRelType.ResourceRelType;
import ro.webdata.parser.xml.lido.core.leaf.resourceRepresentation.ResourceRepresentation;
import ro.webdata.parser.xml.lido.core.leaf.resourceSource.ResourceSource;
import ro.webdata.parser.xml.lido.core.leaf.resourceType.ResourceType;
import ro.webdata.parser.xml.lido.core.leaf.rightsResource.RightsResource;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for sets of resource information.<br/>
 * 		<b>How to record:</b> If there are multiple, distinct resources associated with the object / work,
 * 		repeat the Resource Set element. For variants representing the same resource repeat the Resource
 * 		Representation sub-element.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>resourceID (lido:identifierComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The unique numeric or alphanumeric identification of the original
 * 				(digital or analogue) resource<br/>
 * 			</div>
 * 			<b>resourceRepresentation (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A digital representation of a resource for online presentation.<br/>
 * 				<b>How to record:</b> Repeat this element set for variants representing the same resource,
 * 				e.g. different sizes of the same image, or a thumbnail representing an audio or video
 * 				file and the digital audio or video file itself.
 * 			</div>
 * 			<b>resourceType (lido:conceptComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The generic identification of the medium of the image or other resource.<br/>
 * 				<b>How to record:</b> Preferably using a controlled published value list. Example values: digital image,
 * 				photograph, slide, videotape, X-ray photograph, negative.
 * 			</div>
 * 			<b>resourceRelType (lido:conceptComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The relationship of the resource to the object / work being described.<br/>
 * 				<b>How to record:</b> Example values: conservation image, documentary image, contextual image, historical
 * 				image, reconstruction, and installation image.
 * 			</div>
 * 			<b>resourcePerspective (lido:conceptComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The specific vantage point or perspective of the view.
 * 			</div>
 * 			<b>resourceDescription (0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A description of the spatial, chronological, or contextual aspects of the object /
 * 				work as captured in this particular resource.
 * 			</div>
 * 			<b>resourceDateTaken (lido:dateSetComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A date or range of dates associated with the creation or production of the original
 * 				resource, e.g. the image or recording.<br/>
 * 				<b>Note:</b> This is not necessarily the same as the date of production of the digital resource (e.g.
 * 				a digitization of a negative is usually made years after the image was captured on film). Format will
 * 				vary depending upon implementation.
 * 			</div>
 * 			<b>resourceSource (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Identification of the agency, individual, or repository from which the image or other
 * 				resource was obtained.<br/>
 * 				<b>How to record:</b> Include this sub-element when the source of the image/resource differs from the
 * 				source named in Record Source.
 * 			</div>
 * 			<b>rightsResource (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Information about rights regarding the image or other resource.<br/>
 * 				<b>How to record:</b> Use this sub-element if the holder of the reproduction rights for the image/resource
 * 				differs from the holder of rights for the work. See also Rights Work above. (E.g., the work rights are
 * 				" National Museum of African Art, Smithsonian Instituition (Washing DC), " but the image rights are
 * 				"Photo Frank Khoury.")
 * 			</div>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceSetComplexType {
	private ResourceID resourceID;
	private List<ResourceRepresentation> resourceRepresentation;
	private ResourceType resourceType;
	private List<ResourceRelType> resourceRelType;
	private List<ResourcePerspective> resourcePerspective;
	private List<ResourceDescription> resourceDescription;
	private ResourceDateTaken resourceDateTaken;
	private List<ResourceSource> resourceSource;
	private List<RightsResource> rightsResource;

	public ResourceSetComplexType() {}

	public ResourceSetComplexType(ResourceID resourceID, List<ResourceRepresentation> resourceRepresentation,
			ResourceType resourceType, List<ResourceRelType> resourceRelType,
			List<ResourcePerspective> resourcePerspective, List<ResourceDescription> resourceDescription,
			ResourceDateTaken resourceDateTaken, List<ResourceSource> resourceSource, List<RightsResource> rightsResource) {
		setResourceID(resourceID);
		setResourceRepresentation(resourceRepresentation);
		setResourceType(resourceType);
		setResourceRelType(resourceRelType);
		setResourcePerspective(resourcePerspective);
		setResourceDescription(resourceDescription);
		setResourceDateTaken(resourceDateTaken);
		setResourceSource(resourceSource);
		setRightsResource(rightsResource);
	}

	public ResourceID getResourceID() {
		return resourceID;
	}

	public void setResourceID(ResourceID resourceID) {
		this.resourceID = resourceID;
	}

	public List<ResourceRepresentation> getResourceRepresentation() {
		return resourceRepresentation;
	}

	public void setResourceRepresentation(List<ResourceRepresentation> resourceRepresentation) {
		this.resourceRepresentation = resourceRepresentation;
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public List<ResourceRelType> getResourceRelType() {
		return resourceRelType;
	}

	public void setResourceRelType(List<ResourceRelType> resourceRelType) {
		this.resourceRelType = resourceRelType;
	}

	public List<ResourcePerspective> getResourcePerspective() {
		return resourcePerspective;
	}

	public void setResourcePerspective(List<ResourcePerspective> resourcePerspective) {
		this.resourcePerspective = resourcePerspective;
	}

	public List<ResourceDescription> getResourceDescription() {
		return resourceDescription;
	}

	public void setResourceDescription(List<ResourceDescription> resourceDescription) {
		this.resourceDescription = resourceDescription;
	}

	public ResourceDateTaken getResourceDateTaken() {
		return resourceDateTaken;
	}

	public void setResourceDateTaken(ResourceDateTaken resourceDateTaken) {
		this.resourceDateTaken = resourceDateTaken;
	}

	public List<ResourceSource> getResourceSource() {
		return resourceSource;
	}

	public void setResourceSource(List<ResourceSource> resourceSource) {
		this.resourceSource = resourceSource;
	}

	public List<RightsResource> getRightsResource() {
		return rightsResource;
	}

	public void setRightsResource(List<RightsResource> rightsResource) {
		this.rightsResource = rightsResource;
	}
}
