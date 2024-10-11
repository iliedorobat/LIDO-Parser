package ro.webdata.parser.xml.lido.core.leaf.nationalityActor;

import org.w3c.dom.Node;

public interface NationalityActorDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>NationalityActor</b>
	 */
	NationalityActor getNationalityActor(Node node);
}
