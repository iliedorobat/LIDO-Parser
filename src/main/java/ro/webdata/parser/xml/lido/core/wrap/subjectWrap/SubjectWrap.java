package ro.webdata.parser.xml.lido.core.wrap.subjectWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.set.subjectSet.SubjectSet;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for SubjectDAO information. This may be the visual content
 * 		(e.g. the iconography of a painting) or what the object is about.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>subjectSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for display and index elements for one set of subject information.<br/>
 * 				<b>How to record:</b> If an object / work has multiple parts or otherwise has separate,
 * 				multiple subjects, repeat this element and use Extent SubjectDAO in the SubjectDAO element.
 * 				This element may also be repeated to distinguish between subjects that reflect what an
 * 				object / work is *of* (description and identification) from what it is *about* (interpretation).
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SubjectWrap {
	private ArrayList<SubjectSet> subjectSet;

	public SubjectWrap() {}

	public SubjectWrap(ArrayList<SubjectSet> subjectSet) {
		setSubjectSet(subjectSet);
	}

	public ArrayList<SubjectSet> getSubjectSet() {
		return subjectSet;
	}

	public void setSubjectSet(ArrayList<SubjectSet> subjectSet) {
		this.subjectSet = subjectSet;
	}
}
