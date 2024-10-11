package ro.webdata.parser.xml.lido.core.leaf.actor;

import ro.webdata.parser.xml.lido.core.complex.actorComplexType.ActorComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Contains structured identifying and indexing actor information.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Actor extends ActorComplexType {
	public Actor() {}

	public Actor(ActorComplexType actorComplexType) {
		super(
			actorComplexType.getActorID(),
			actorComplexType.getNameActorSet(),
			actorComplexType.getNationalityActor(),
			actorComplexType.getVitalDatesActor(),
			actorComplexType.getGenderActor(),
			actorComplexType.getType()
		);
	}
}
