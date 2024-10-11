package ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType;

import org.w3c.dom.Node;

public interface DescriptiveNoteComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteComplexType</b> node type.
	 * @return <b>DescriptiveNoteComplexType</b>
	 */
	DescriptiveNoteComplexType getDescriptiveNoteComplexType(Node node);
}
