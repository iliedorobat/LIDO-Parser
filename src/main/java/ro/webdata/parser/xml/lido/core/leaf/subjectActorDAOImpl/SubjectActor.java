package ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.actorSetComplexType.ActorSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A person, group, or institution depicted in or by an object / work,
 * 			or what it is about, provided as display and index elements.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SubjectActor extends ActorSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectActor() {}

	public SubjectActor(ActorSetComplexType actorSetComplexType, LidoSortOrder sortOrder) {
		super(
			actorSetComplexType.getDisplayActor(),
			actorSetComplexType.getActor()
		);
		setSortOrder(sortOrder);
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
