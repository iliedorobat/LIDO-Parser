package ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSet;

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
	private ArrayList<RelatedWorkSet> relatedWorkSet = new ArrayList<RelatedWorkSet>();

	public RelatedWorksWrap() {}

	public RelatedWorksWrap(ArrayList<RelatedWorkSet> relatedWorkSet) {
		setRelatedWorkSet(relatedWorkSet);
	}

	public ArrayList<RelatedWorkSet> getRelatedWorkSet() {
		return relatedWorkSet;
	}

	public void setRelatedWorkSet(ArrayList<RelatedWorkSet> relatedWorkSet) {
		this.relatedWorkSet = relatedWorkSet;
	}
}
