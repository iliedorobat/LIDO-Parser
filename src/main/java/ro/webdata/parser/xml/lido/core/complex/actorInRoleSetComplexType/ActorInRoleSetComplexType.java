package ro.webdata.parser.xml.lido.core.complex.actorInRoleSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.actorInRole.ActorInRole;
import ro.webdata.parser.xml.lido.core.leaf.displayActorInRole.DisplayActorInRole;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for an actor with role information
 * 		(participating in an event). For multiple actors repeat the element.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayActorInRole (lido:textComplexType 1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for an actor coupled with its specific role, corresponding
 * 				to the following actor element.<br/>
 * 				<b>How to record:</b> May include name, brief biographical information, and roles (if necessary)
 * 				of the named actor, presented in a syntax suitable for display to the end-user and including any
 * 				necessary indications of uncertainty, ambiguity, and nuance. If there is no known actor, make a
 * 				reference to the presumed culture or nationality of the unknown actor.May be concatenated from the
 * 				respective Actor element. The name should be in natural order, if possible, although inverted order
 * 				is acceptable. Include nationality and life dates. For unknown actors, use e.g.: "unknown," "unknown
 * 				Chinese," "Chinese," or "unknown 15th century Chinese."Repeat this element only for language variants.
 * 			</div>
 * 			<b>actorInRole (lido:actorInRoleComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Describes an actor with role and (if necessary) attributions in a structured way,
 * 				consisting of the sub-elements actor, its role, attribution and extent.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ActorInRoleSetComplexType {
	private ArrayList<DisplayActorInRole> displayActorInRole;
	private ActorInRole actorInRole;

	public ActorInRoleSetComplexType() {}

	public ActorInRoleSetComplexType(ArrayList<DisplayActorInRole> displayActorInRole, ActorInRole actorInRole) {
		setActorInRole(actorInRole);
		setDisplayActorInRole(displayActorInRole);
	}

	public ArrayList<DisplayActorInRole> getDisplayActorInRole() {
		return displayActorInRole;
	}

	public void setDisplayActorInRole(ArrayList<DisplayActorInRole> displayActorInRole) {
		this.displayActorInRole = displayActorInRole;
	}

	public ActorInRole getActorInRole() {
		return actorInRole;
	}

	public void setActorInRole(ActorInRole actorInRole) {
		this.actorInRole = actorInRole;
	}
}
