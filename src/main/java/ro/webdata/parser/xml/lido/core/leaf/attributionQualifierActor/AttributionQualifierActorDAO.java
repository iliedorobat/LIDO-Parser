package ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor;

import org.w3c.dom.Node;

public interface AttributionQualifierActorDAO {
	/**
	 *
	 * @param node <b>lido:attributionQualifierActor</b> node type.
	 * @return <b>AttributionQualifierActor</b>
	 */
	AttributionQualifierActor getAttributionQualifierActor(Node node);
}
