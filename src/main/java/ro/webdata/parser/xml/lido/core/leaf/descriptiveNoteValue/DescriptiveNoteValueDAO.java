package ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteValue;

import org.w3c.dom.Node;

public interface DescriptiveNoteValueDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteValue</b> node type.
	 * @return <b>DescriptiveNoteValue</b>
	 */
	DescriptiveNoteValue getDescriptiveNoteValue(Node node);
}
