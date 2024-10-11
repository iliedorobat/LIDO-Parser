package ro.webdata.parser.xml.lido.core.complex.objectComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.objectID.ObjectID;
import ro.webdata.parser.xml.lido.core.leaf.objectNote.ObjectNote;
import ro.webdata.parser.xml.lido.core.leaf.objectWebResource.ObjectWebResource;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Reference to an object / work.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>objectWebResource (lido:webResourceComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A URL-Reference to a description of the object / work in the
 * 				worldwide web environment.
 * 			</div>
 * 			<b>objectID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Unique identifier of the referenced object / work.
 * 			</div>
 * 			<b>objectNote (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A descriptive identification of the object / work that will be
 * 				meaningful to end-users, including some or all of the following information, as
 * 				necessary for clarity and if known: title, object/work type, important actor, date
 * 				and/or place information, potentially location of the object / work.<br/>
 * 				<b>How to record:</b> The information should ideally be generated from fields/elements
 * 				in the related record.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectComplexType {
	private ArrayList<ObjectWebResource> objectWebResource;
	private ArrayList<ObjectID> objectID;
	private ArrayList<ObjectNote> objectNote;

	public ObjectComplexType() {}

	public ObjectComplexType(ArrayList<ObjectWebResource> objectWebResource, ArrayList<ObjectID> objectID,
			ArrayList<ObjectNote> objectNote) {
		setObjectID(objectID);
		setObjectNote(objectNote);
		setObjectWebResource(objectWebResource);
	}

	public ArrayList<ObjectWebResource> getObjectWebResource() {
		return objectWebResource;
	}

	public void setObjectWebResource(ArrayList<ObjectWebResource> objectWebResource) {
		this.objectWebResource = objectWebResource;
	}

	public ArrayList<ObjectID> getObjectID() {
		return objectID;
	}

	public void setObjectID(ArrayList<ObjectID> objectID) {
		this.objectID = objectID;
	}

	public ArrayList<ObjectNote> getObjectNote() {
		return objectNote;
	}

	public void setObjectNote(ArrayList<ObjectNote> objectNote) {
		this.objectNote = objectNote;
	}
}
