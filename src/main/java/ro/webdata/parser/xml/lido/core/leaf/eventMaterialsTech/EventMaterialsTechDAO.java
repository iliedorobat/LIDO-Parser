package ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech;

import org.w3c.dom.Node;

public interface EventMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:eventMaterialsTech</b> node type.
	 * @return <b>EventMaterialsTech</b>
	 */
	EventMaterialsTech getEventMaterialsTech(Node node);
}
