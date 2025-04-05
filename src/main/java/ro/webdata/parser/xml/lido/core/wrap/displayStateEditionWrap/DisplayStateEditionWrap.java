package ro.webdata.parser.xml.lido.core.wrap.displayStateEditionWrap;

import ro.webdata.parser.xml.lido.core.leaf.displayEdition.DisplayEdition;
import ro.webdata.parser.xml.lido.core.leaf.displayState.DisplayState;
import ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition.SourceStateEdition;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for the state and edition of the object / work.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayState (lido:textComplexType 0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A description of the state of the object / work.
 * 				Used primarily for prints and other multiples.<br/>
 * 				<b>How to record:</b> Formulated according to rules. For State, include
 * 				state identification and known states, as appropriate.Repeat this element
 * 				only for language variants.
 * 			</div>
 * 		</div>
 * 		<div class="lido-elem">
 * 			<b>displayEdition (lido:textComplexType 0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A description of the edition of the object / work.
 * 				Used primarily for prints and other multiples.<br/>
 * 				<b>How to record:</b> Formulated according to rules. For Edition, include
 * 				impression number, edition size, and edition number, or edition name, as
 * 				appropriate.Repeat this element only for language variants.
 * 			</div>
 * 		</div>
 * 		<div class="lido-elem">
 * 			<b>sourceStateEdition (lido:textComplexType 0-unbounded)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The published source of the state or edition information.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayStateEditionWrap {
	private List<DisplayState> displayState;
	private List<DisplayEdition> displayEdition;
	private List<SourceStateEdition> sourceStateEdition;

	public DisplayStateEditionWrap() {}

	public DisplayStateEditionWrap(List<DisplayState> displayState, List<DisplayEdition> displayEdition,
			List<SourceStateEdition> sourceStateEdition) {
		setDisplayState(displayState);
		setDisplayEdition(displayEdition);
		setSourceStateEdition(sourceStateEdition);
	}

	public List<DisplayState> getDisplayState() {
		return displayState;
	}

	public void setDisplayState(List<DisplayState> displayState) {
		this.displayState = displayState;
	}

	public List<DisplayEdition> getDisplayEdition() {
		return displayEdition;
	}

	public void setDisplayEdition(List<DisplayEdition> displayEdition) {
		this.displayEdition = displayEdition;
	}

	public List<SourceStateEdition> getSourceStateEdition() {
		return sourceStateEdition;
	}

	public void setSourceStateEdition(List<SourceStateEdition> sourceStateEdition) {
		this.sourceStateEdition = sourceStateEdition;
	}
}
