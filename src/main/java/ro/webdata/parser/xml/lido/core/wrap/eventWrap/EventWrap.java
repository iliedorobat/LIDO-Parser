package ro.webdata.parser.xml.lido.core.wrap.eventWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.set.eventSet.EventSet;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for event sets.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>eventSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for the display and index elements for events
 * 				(e.g. creation, find, and use), in which the object participated.<br/>
 * 				<b>How to record:</b> For multiple events repeat the element.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventWrap {
	private ArrayList<EventSet> eventSet = new ArrayList<EventSet>();

	public EventWrap() {}

	public EventWrap(ArrayList<EventSet> eventSet) {
		setEventSet(eventSet);
	}

	public ArrayList<EventSet> getEventSet() {
		return eventSet;
	}

	public void setEventSet(ArrayList<EventSet> eventSet) {
		this.eventSet = eventSet;
	}
}
