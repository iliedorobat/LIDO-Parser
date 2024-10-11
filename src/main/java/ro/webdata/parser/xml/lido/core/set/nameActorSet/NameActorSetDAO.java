package ro.webdata.parser.xml.lido.core.set.nameActorSet;

import org.w3c.dom.Node;

public interface NameActorSetDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>NameActorSet</b>
	 */
	NameActorSet getNameActorSet(Node node);
}
