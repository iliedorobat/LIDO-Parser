package ro.webdata.parser.xml.lido.core.leaf.genderActor;

import org.w3c.dom.Node;

public interface GenderActorDAO {
	/**
	 *
	 * @param node <b>lido:genderActor</b> node type.
	 * @return <b>GenderActor</b>
	 */
	GenderActor getGenderActor(Node node);
}
