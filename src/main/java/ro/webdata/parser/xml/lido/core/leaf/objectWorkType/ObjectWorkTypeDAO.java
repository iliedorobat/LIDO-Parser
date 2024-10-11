package ro.webdata.parser.xml.lido.core.leaf.objectWorkType;

import org.w3c.dom.Node;

public interface ObjectWorkTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectWorkType</b> node type.
	 * @return <b>ObjectWorkType</b>
	 */
	ObjectWorkType getObjectWorkType(Node node);
}
