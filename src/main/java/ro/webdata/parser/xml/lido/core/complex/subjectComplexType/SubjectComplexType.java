package ro.webdata.parser.xml.lido.core.complex.subjectComplexType;

import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.extentSubject.ExtentSubject;
import ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl.SubjectActor;
import ro.webdata.parser.xml.lido.core.leaf.subjectConcept.SubjectConcept;
import ro.webdata.parser.xml.lido.core.leaf.subjectDate.SubjectDate;
import ro.webdata.parser.xml.lido.core.leaf.subjectEvent.SubjectEvent;
import ro.webdata.parser.xml.lido.core.leaf.subjectObject.SubjectObject;
import ro.webdata.parser.xml.lido.core.leaf.subjectPlace.SubjectPlace;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for one set of SubjectDAO Indexing information.<br/>
 * 		<b>How to record:</b> If an object / work has multiple parts or otherwise has
 * 		separate, multiple subjects, repeat the superordinate SubjectDAO Set element and
 * 		use Extent SubjectDAO. The superordinate SubjectDAO Set element may also be repeated
 * 		to distinguish between subjects that reflect what an object / work is *of*
 * 		(description and identification) from what it is *about* (interpretation).<br/>
 * 		<b>Notes:</b> While not required, it is highly recommended to include subject
 * 		information, even for non-objective art, for which the function or purpose of
 * 		the object / work may be included as subject.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>extentSubject (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> When there are multiple subjects, a term indicating the
 * 				part of the object / work to which these subject terms apply.<br/>
 * 				<b>How to record:</b> Example values: recto, verso, side A, side B, main panel,
 * 				and predella. Repeat this element only for language variants.
 * 			</div>
 * 			<b>subjectConcept (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Provides references to concepts related to the subject
 * 				of the described object / work. <br/>
 * 				<b>How to record:</b> May include iconography, themes from literature,
 * 				or generic terms describing the material world, or topics (e.g., concepts,
 * 				themes, or issues). However, references to people, dates, events, places,
 * 				objects are indicated in the the respective sub-elements SubjectDAO Actor Set,
 * 				SubjectDAO Date Set, SubjectDAO Event Set, SubjectDAO Place Set, and SubjectDAO Object Set.
 * 				Preferably taken from a published controlled vocabulary.
 * 			</div>
 * 			<b>subjectActor (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A person, group, or institution depicted in or by an object / work,
 * 				or what it is about, provided as display and index elements.
 * 			</div>
 * 			<b>subjectDate (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A time specification depicted in or by an object / work,
 * 				or what it is about, provided as display and index elements.
 * 			</div>
 * 			<b>subjectEvent (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A time specification depicted in or by an object / work,
 * 				or what it is about, provided as display and index elements.
 * 			</div>
 * 			<b>subjectPlace (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A place depicted in or by an object / work, or what
 * 				it is about, provided as display and index elements.
 * 			</div>
 * 			<b>subjectObject (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> An object - e.g. a building or a work of art depicted
 * 				in or by an object / work, or what it is about, provided as display and
 * 				index elements.
 * 			</div>
 * 		</div>
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
public class SubjectComplexType {
	private List<ExtentSubject> extentSubject;
	private List<SubjectConcept> subjectConcept;
	private List<SubjectActor> subjectActor;
	private List<SubjectDate> subjectDate;
	private List<SubjectEvent> subjectEvent;
	private List<SubjectPlace> subjectPlace;
	private List<SubjectObject> subjectObject;
	private LidoType type;

	public SubjectComplexType() {}

	public SubjectComplexType(List<ExtentSubject> extentSubject, List<SubjectConcept> subjectConcept,
			List<SubjectActor> subjectActor, List<SubjectDate> subjectDate, List<SubjectEvent> subjectEvent,
			List<SubjectPlace> subjectPlace, List<SubjectObject> subjectObject, LidoType type) {
		setExtentSubject(extentSubject);
		setSubjectActor(subjectActor);
		setSubjectConcept(subjectConcept);
		setSubjectDate(subjectDate);
		setSubjectEvent(subjectEvent);
		setSubjectObject(subjectObject);
		setSubjectPlace(subjectPlace);
		setType(type);
	}

	public List<ExtentSubject> getExtentSubject() {
		return extentSubject;
	}

	public void setExtentSubject(List<ExtentSubject> extentSubject) {
		this.extentSubject = extentSubject;
	}

	public List<SubjectConcept> getSubjectConcept() {
		return subjectConcept;
	}

	public void setSubjectConcept(List<SubjectConcept> subjectConcept) {
		this.subjectConcept = subjectConcept;
	}

	public List<SubjectActor> getSubjectActor() {
		return subjectActor;
	}

	public void setSubjectActor(List<SubjectActor> subjectActor) {
		this.subjectActor = subjectActor;
	}

	public List<SubjectDate> getSubjectDate() {
		return subjectDate;
	}

	public void setSubjectDate(List<SubjectDate> subjectDate) {
		this.subjectDate = subjectDate;
	}

	public List<SubjectEvent> getSubjectEvent() {
		return subjectEvent;
	}

	public void setSubjectEvent(List<SubjectEvent> subjectEvent) {
		this.subjectEvent = subjectEvent;
	}

	public List<SubjectPlace> getSubjectPlace() {
		return subjectPlace;
	}

	public void setSubjectPlace(List<SubjectPlace> subjectPlace) {
		this.subjectPlace = subjectPlace;
	}

	public List<SubjectObject> getSubjectObject() {
		return subjectObject;
	}

	public void setSubjectObject(List<SubjectObject> subjectObject) {
		this.subjectObject = subjectObject;
	}
	
	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}
}
