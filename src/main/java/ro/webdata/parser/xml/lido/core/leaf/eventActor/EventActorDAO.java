package ro.webdata.parser.xml.lido.core.leaf.eventActor;

import org.w3c.dom.Node;

public interface EventActorDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>EventActor</b>
	 */
	EventActor getEventActor(Node node);
}
