package ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID;

import org.w3c.dom.Node;

public interface DescriptiveNoteIDDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteID</b> node type.
	 * @return <b>DescriptiveNoteID</b>
	 */
	DescriptiveNoteID getDescriptiveNoteID(Node node);
}
