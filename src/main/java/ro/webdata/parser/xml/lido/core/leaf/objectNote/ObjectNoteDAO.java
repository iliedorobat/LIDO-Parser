package ro.webdata.parser.xml.lido.core.leaf.objectNote;

import org.w3c.dom.Node;

public interface ObjectNoteDAO {
	/**
	 *
	 * @param node <b>lido:objectNote</b> node type.
	 * @return <b>ObjectNote</b>
	 */
	ObjectNote getObjectNote(Node node);
}
