package ro.webdata.parser.xml.lido.core.set.objectDescriptionSet;

import org.w3c.dom.Node;

public interface ObjectDescriptionSetDAO {
	/**
	 *
	 * @param node <b>lido:objectDescriptionSet</b> node type.
	 * @return <b>ObjectDescriptionSet</b>
	 */
	ObjectDescriptionSet getObjectDescriptionSet(Node node);
}
