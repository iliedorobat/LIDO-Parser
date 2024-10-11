package ro.webdata.parser.xml.lido.core.leaf.actorInRole;

import ro.webdata.parser.xml.lido.core.complex.actorInRoleComplexType.ActorInRoleComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Describes an actor with role and (if necessary) attributions in a
 * 			structured way, consisting of the sub-elements actor, its role, attribution and extent.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ActorInRole extends ActorInRoleComplexType {
	public ActorInRole() {}

	public ActorInRole(ActorInRoleComplexType actorInRoleComplexType) {
		super(
			actorInRoleComplexType.getActor(),
			actorInRoleComplexType.getRoleActor(),
			actorInRoleComplexType.getAttributionQualifierActor(),
			actorInRoleComplexType.getExtentActor()
		);
	}
}
