package ro.webdata.lido.parser.core.wrap.titleWrap;

import java.util.ArrayList;

import ro.webdata.lido.parser.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrap;
import ro.webdata.lido.parser.core.set.titleSet.TitleSet;
import ro.webdata.lido.parser.common.PrintMessages;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for Object name / Title information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>titleSet (1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for one title or object name and its source information.<br/>
 * 				<b>How to record:</b> Mandatory. If there is no specific title, provide an object name
 * 				in the appellation value. If there is more than one title, repeat the Title Set element.<br/>
 * 				<b>Notes:</b> For objects from natural, technical, cultural history e.g. the object name
 * 				given here and the object type, recorded in the object / work type element are often identical.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class TitleWrap {
	private ArrayList<TitleSet> titleSet;
	private PrintMessages printMessages = new PrintMessages();

	public TitleWrap() {}

	public TitleWrap(ArrayList<TitleSet> titleSet) {
		setTitleSet(titleSet);

		if (titleSet == null || titleSet.isEmpty()) {
			printMessages.printEmptyArray(ObjectWorkTypeWrap.class, "lido:titleSet");
		}
	}

	public ArrayList<TitleSet> getTitleSet() {
		return titleSet;
	}

	public void setTitleSet(ArrayList<TitleSet> titleSet) {
		this.titleSet = titleSet;
	}
}