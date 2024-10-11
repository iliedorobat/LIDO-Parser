package ro.webdata.parser.xml.lido.core.complex.repositorySetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.repositoryLocation.RepositoryLocation;
import ro.webdata.parser.xml.lido.core.leaf.repositoryName.RepositoryName;
import ro.webdata.parser.xml.lido.core.leaf.workID.WorkID;

/**
 * <link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for designation and identification of the institution of custody and,
 * 		possibly, indication of the exact location of the object.<br/>
 * 		<b>How to record:</b> If there are several designations known, e.g., a current one and former ones
 * 		(see: type attribute), repeat the element.Data values of the type attribute: current, former.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>repositoryName (lido:legalBodyRefComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Unambiguous identification, designation and weblink of the institution of custody.
 * 			</div>
 * 			<b>workID (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> An unambiguous numeric or alphanumeric identification number, assigned to the
 * 				object by the institution of custody..
 * 			</div>
 * 			<b>repositoryLocation (lido:placeComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Location of the object, especially relevant for architecture and archaeological sites.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type</b>
 * 			<div class="lido-attr-doc">
 * 				<b>Definition:</b> Qualifies the repository as a former or the current repository.<br/>
 * 				<b>How to record:</b> Data values: current, former
 * 			</div>
 * 			<b>sortOrder</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RepositorySetComplexType {
	private RepositoryName repositoryName;
	private ArrayList<WorkID> workID;
	private RepositoryLocation repositoryLocation;
	private LidoType type;
	private LidoSortOrder sortOrder;

	public RepositorySetComplexType() {}

	public RepositorySetComplexType(RepositoryName repositoryName, ArrayList<WorkID> workID,
	RepositoryLocation repositoryLocation, LidoType type, LidoSortOrder sortOrder) {
		setRepositoryName(repositoryName);
		setWorkID(workID);
		setRepositoryLocation(repositoryLocation);
		setType(type);
		setSortOrder(sortOrder);
	}

	public RepositoryName getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(RepositoryName repositoryName) {
		this.repositoryName = repositoryName;
	}

	public ArrayList<WorkID> getWorkID() {
		return workID;
	}

	public void setWorkID(ArrayList<WorkID> workID) {
		this.workID = workID;
	}

	public RepositoryLocation getRepositoryLocation() {
		return repositoryLocation;
	}

	public void setRepositoryLocation(RepositoryLocation repositoryLocation) {
		this.repositoryLocation = repositoryLocation;
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
