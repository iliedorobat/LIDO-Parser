package ro.webdata.parser.xml.lido.core.leaf.resourceRepresentation;

import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType.MeasurementsSetComplexType;
import ro.webdata.parser.xml.lido.core.leaf.linkResource.LinkResource;

import java.util.List;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A digital representation of a resource for online presentation.<br/>
 * 		<b>How to record:</b> Repeat this element set for variants representing the same resource,
 * 		e.g. different sizes of the same image, or a thumbnail representing an audio or video file
 * 		and the digital audio or video file itself.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>linkResource (1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A url reference in the worldwide web environment.
 * 			</div>
 * 			<b>resourceMeasurementsSet (lido:measurementsSetComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Any technical measurement information needed for online presentation of
 * 				the resource.<br/>
 * 				<b>How to record:</b> For images provide width and height of the digital image, for audio or
 * 				video resources provide duration, bit rate, frame size, and if necessary TC-IN, TC-OUT.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceRepresentation {
	private LinkResource linkResource;
	private List<MeasurementsSetComplexType> resourceMeasurementsSet;
	private LidoType type;
	private PrintMessages printMessages = new PrintMessages();

	public ResourceRepresentation() {}

	public ResourceRepresentation(LinkResource linkResource,
			List<MeasurementsSetComplexType> resourceMeasurementsSet, LidoType type) {
		setLinkResource(linkResource);
		setResourceMeasurementsSet(resourceMeasurementsSet);
		setType(type);

		if (linkResource == null) {
			printMessages.printUndefinedNode(ResourceRepresentation.class, "lido:linkResource");
		}
	}

	public LinkResource getLinkResource() {
		return linkResource;
	}

	public void setLinkResource(LinkResource linkResource) {
		this.linkResource = linkResource;
	}

	public List<MeasurementsSetComplexType> getResourceMeasurementsSet() {
		return resourceMeasurementsSet;
	}

	public void setResourceMeasurementsSet(List<MeasurementsSetComplexType> resourceMeasurementsSet) {
		this.resourceMeasurementsSet = resourceMeasurementsSet;
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}
}
