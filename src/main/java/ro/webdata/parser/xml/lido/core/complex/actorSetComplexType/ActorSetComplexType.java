package ro.webdata.parser.xml.lido.core.complex.actorSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.actor.Actor;
import ro.webdata.parser.xml.lido.core.leaf.displayActor.DisplayActor;

/**
 * <link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Wrapper for display and index elements for one actor. For multiple actors repeat this element.
 * 		</div>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayActor (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for one actor, corresponding to the following actor element.<br/>
 * 				<b>How to record:</b> May include name, brief biographical information of the named actor, presented
 * 				in a syntax suitable for display to the end-user. If there is no known actor, make a reference to the
 * 				presumed culture or nationality of the unknown actor.May be concatenated from the respective Actor element.
 * 				The name should be in natural order, if possible, although inverted order is acceptable. Include nationality
 * 				and life dates. For unknown actors, use e.g.: "unknown," "unknown Chinese," "Chinese," or "unknown 15th century
 * 				Chinese. "Repeat this element only for language variants.<br/>
 * 			</div>
 * 			<b>actor (lido:actorComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Describes an actor with role and (if necessary) attributions in a structured way, consisting
 * 				of the sub-elements actor, its role, attribution and extent.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ActorSetComplexType {
	private ArrayList<DisplayActor> displayActor;
	private Actor actor;

	public ActorSetComplexType() {}

	public ActorSetComplexType(ArrayList<DisplayActor> displayActor, Actor actor) {
		setActor(actor);
		setDisplayActor(displayActor);
	}

	public ArrayList<DisplayActor> getDisplayActor() {
		return displayActor;
	}

	public void setDisplayActor(ArrayList<DisplayActor> displayActor) {
		this.displayActor = displayActor;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
}
