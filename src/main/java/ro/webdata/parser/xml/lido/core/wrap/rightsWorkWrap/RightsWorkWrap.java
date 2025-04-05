package ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap;

import ro.webdata.parser.xml.lido.core.set.rightsWorkSet.RightsWorkSet;

import java.util.List;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for rights information about the object / work described.<br/>
 * 		<b>Notes:</b> Rights information for the record and for resources is recorded in the
 * 		respective rights elements recordRights and rightsResource.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>rightsWorkSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Information about rights management; may include copyright and
 * 				other intellectual property statements about the object / work.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsWorkWrap {
	private List<RightsWorkSet> rightsWorkSet;

	public RightsWorkWrap() {}

	public RightsWorkWrap(List<RightsWorkSet> rightsWorkSet) {
		setRightsWorkSet(rightsWorkSet);
	}

	public List<RightsWorkSet> getRightsWorkSet() {
		return rightsWorkSet;
	}

	public void setRightsWorkSet(List<RightsWorkSet> rightsWorkSet) {
		this.rightsWorkSet = rightsWorkSet;
	}
}
