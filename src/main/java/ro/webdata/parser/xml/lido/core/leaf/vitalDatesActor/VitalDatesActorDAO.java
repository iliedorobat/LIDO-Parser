package ro.webdata.parser.xml.lido.core.leaf.vitalDatesActor;

import org.w3c.dom.Node;

public interface VitalDatesActorDAO {
	/**
	 *
	 * @param node <b>lido:vitalDatesActor</b> node type.
	 * @return <b>VitalDatesActor</b>
	 */
	VitalDatesActor getVitalDatesActor(Node node);
}
