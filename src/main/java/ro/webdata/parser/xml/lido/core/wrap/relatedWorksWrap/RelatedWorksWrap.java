package ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap;

import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSet;

import java.util.ArrayList;
import java.util.List;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for Related Works information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>relatedWorkSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A wrapper for a object / work, group, collection,
 * 				or series that is directly related to the object / work being recorded.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedWorksWrap {
	private List<RelatedWorkSet> relatedWorkSet = new ArrayList<RelatedWorkSet>();

	public RelatedWorksWrap() {}

	public RelatedWorksWrap(List<RelatedWorkSet> relatedWorkSet) {
		setRelatedWorkSet(relatedWorkSet);
	}

	public List<RelatedWorkSet> getRelatedWorkSet() {
		return relatedWorkSet;
	}

	public void setRelatedWorkSet(List<RelatedWorkSet> relatedWorkSet) {
		this.relatedWorkSet = relatedWorkSet;
	}
}
