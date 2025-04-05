package ro.webdata.parser.xml.lido.core.complex.subjectSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.displaySubject.DisplaySubject;
import ro.webdata.parser.xml.lido.core.leaf.subject.Subject;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for one set of subject information.<br/>
 * 		<b>How to record:</b> If an object / work has multiple parts or otherwise has separate,
 * 		multiple subjects, repeat this element and use Extent SubjectDAO in the SubjectDAO element.
 * 		This element may also be repeated to distinguish between subjects that reflect what an
 * 		object / work is *of* (description and identification) from what it is *about* (interpretation).<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displaySubject (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A free-text description of the subject matter represented
 * 				by/in the object / work, corresponding to the following subject element.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.<br/>
 * 			</div>
 * 			<b>subject (lido:subjectComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Contains sub-elements for a structured subject description.
 * 				These identify, describe, and/or interpret what is depicted in and by an object /
 * 				work or what it is about.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SubjectSetComplexType {
	private List<DisplaySubject> displaySubject;
	private Subject subject;

	public SubjectSetComplexType() {}

	public SubjectSetComplexType(List<DisplaySubject> displaySubject, Subject subjectComplexType) {
		setDisplaySubject(displaySubject);
		setSubject(subjectComplexType);
	}

	public List<DisplaySubject> getDisplaySubject() {
		return displaySubject;
	}

	public void setDisplaySubject(List<DisplaySubject> displaySubject) {
		this.displaySubject = displaySubject;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}
