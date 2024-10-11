package ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap;

import ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap.RelatedWorksWrap;
import ro.webdata.parser.xml.lido.core.wrap.subjectWrap.SubjectWrap;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for infomation about related topics and works, collections, etc.<br/>
 * 		<b>Notes:</b> This includes visual contents and all associated entities the object is about.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>subjectWrap (0-1)</b><br/>
 * 			<b>relatedWorksWrap (0-1)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectRelationWrap {
	private SubjectWrap subjectWrap;
	private RelatedWorksWrap relatedWorksWrap;

	public ObjectRelationWrap() {}

	public ObjectRelationWrap(SubjectWrap subjectWrap, RelatedWorksWrap relatedWorksWrap) {
		setRelatedWorksWrap(relatedWorksWrap);
		setSubjectWrap(subjectWrap);
	}

	public SubjectWrap getSubjectWrap() {
		return subjectWrap;
	}

	public void setSubjectWrap(SubjectWrap subjectWrap) {
		this.subjectWrap = subjectWrap;
	}

	public RelatedWorksWrap getRelatedWorksWrap() {
		return relatedWorksWrap;
	}

	public void setRelatedWorksWrap(RelatedWorksWrap relatedWorksWrap) {
		this.relatedWorksWrap = relatedWorksWrap;
	}
}
