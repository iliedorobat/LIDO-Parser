package ro.webdata.parser.xml.lido.core.wrap.objectDescriptionWrap;

import ro.webdata.parser.xml.lido.core.set.objectDescriptionSet.ObjectDescriptionSet;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for Description/Descriptive Note information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>objectDescriptionSet (lido:objectDescriptionSet 0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for a description of the object, including description
 * 				identifer, descriptive note and sources.<br/>
 * 				<b>How to record:</b> Includes usually a relatively brief essay-like text that
 * 				describes the content and context of the object / work, including comments and
 * 				an interpretation that may supplement, qualify, or explain the physical characteristics,
 * 				subject, circumstances of creation or discovery, or other information about it.If there
 * 				is more than one descriptive note, repeat this element.<br/>
 * 				<b>Notes:</b> A reference to a text resource holding the description may be given in description identifier.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectDescriptionWrap {
	private List<ObjectDescriptionSet> objectDescriptionSet;

	public ObjectDescriptionWrap() {}

	public ObjectDescriptionWrap(List<ObjectDescriptionSet> objectDescriptionSet) {
		setObjectDescriptionSet(objectDescriptionSet);
	}

	public List<ObjectDescriptionSet> getObjectDescriptionSet() {
		return objectDescriptionSet;
	}

	public void setObjectDescriptionSet(List<ObjectDescriptionSet> objectDescriptionSet) {
		this.objectDescriptionSet = objectDescriptionSet;
	}
}
