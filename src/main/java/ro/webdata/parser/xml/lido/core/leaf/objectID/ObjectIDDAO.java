package ro.webdata.parser.xml.lido.core.leaf.objectID;

import org.w3c.dom.Node;

public interface ObjectIDDAO {
	/**
	 *
	 * @param node <b>lido:objectID</b> node type.
	 * @return <b>ObjectID</b>
	 */
	ObjectID getObjectID(Node node);
}
