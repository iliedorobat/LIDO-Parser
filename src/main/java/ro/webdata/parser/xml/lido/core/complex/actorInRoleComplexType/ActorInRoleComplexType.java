package ro.webdata.parser.xml.lido.core.complex.actorInRoleComplexType;

import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.leaf.actor.Actor;
import ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor.AttributionQualifierActor;
import ro.webdata.parser.xml.lido.core.leaf.extentActor.ExtentActor;
import ro.webdata.parser.xml.lido.core.leaf.roleActor.RoleActor;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Describes an actor with role and (if necessary) attributions related
 * 		to the event the actor participated in.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>actor (lido:actorComplexType 1-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Contains structured identifying and indexing actor information.
 * 			</div>
 * 			<b>roleActor (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Role of the Actor in the event.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 			</div>
 * 			<b>attributionQualifierActor (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A qualifier used when the attribution is uncertain, is in dispute,
 * 				when there is more than one actor, when there is a former attribution, or when the
 *	 			attribution otherwise requires explanation.<br/>
 * 				<b>How to record:</b> Example values: attributed to, studio of, workshop of, atelier of,
 * 				office of, assistant of, associate of, pupil of, follower of, school of, circle of, style of,
 * 				after copyist of, manner of...
 * 			</div>
 * 			<b>extentActor (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Extent of the actor's participation in the event, if there are several actors.<br/>
 * 				<b>How to record:</b> Example values: design, execution, with additions by, figures, renovation by,
 * 				predella, embroidery, cast by, printed by, ...
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ActorInRoleComplexType {
	private Actor actor;
	private List<RoleActor> roleActor;
	private List<AttributionQualifierActor> attributionQualifierActor;
	private List<ExtentActor> extentActor;
	private PrintMessages printMessages = new PrintMessages();

	public ActorInRoleComplexType() {}

	public ActorInRoleComplexType(Actor actor, List<RoleActor> roleActor,
			List<AttributionQualifierActor> attributionQualifierActor, List<ExtentActor> extentActor) {
		setActor(actor);
		setAttributionQualifierActor(attributionQualifierActor);
		setExtentActor(extentActor);
		setRoleActor(roleActor);

		if (actor == null) {
			printMessages.printUndefinedNode(ActorInRoleComplexType.class, "lido:actor");
		}
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public List<RoleActor> getRoleActor() {
		return roleActor;
	}

	public void setRoleActor(List<RoleActor> roleActor) {
		this.roleActor = roleActor;
	}

	public List<AttributionQualifierActor> getAttributionQualifierActor() {
		return attributionQualifierActor;
	}

	public void setAttributionQualifierActor(List<AttributionQualifierActor> attributionQualifierActor) {
		this.attributionQualifierActor = attributionQualifierActor;
	}

	public List<ExtentActor> getExtentActor() {
		return extentActor;
	}

	public void setExtentActor(List<ExtentActor> extentActor) {
		this.extentActor = extentActor;
	}
}
