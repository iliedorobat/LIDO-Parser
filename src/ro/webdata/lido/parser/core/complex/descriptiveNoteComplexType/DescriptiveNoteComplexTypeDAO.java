package ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType;

import org.w3c.dom.Node;

public interface DescriptiveNoteComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteComplexType</b> node type.
	 * @return <b>DescriptiveNoteComplexType</b>
	 */
	DescriptiveNoteComplexType getDescriptiveNoteComplexType(Node node);
}
