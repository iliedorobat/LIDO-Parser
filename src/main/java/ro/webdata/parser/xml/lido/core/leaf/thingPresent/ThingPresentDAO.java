package ro.webdata.parser.xml.lido.core.leaf.thingPresent;

import org.w3c.dom.Node;

public interface ThingPresentDAO {
	/**
	 *
	 * @param node <b>lido:thingPresent</b> node type.
	 * @return <b>ThingPresent</b>
	 */
	ThingPresent getThingPresent(Node node);
}
