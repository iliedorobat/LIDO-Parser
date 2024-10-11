package ro.webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote;

import org.w3c.dom.Node;

public interface SourceDescriptiveNoteDAO {
	/**
	 *
	 * @param node <b>lido:sourceDescriptiveNote</b> node type.
	 * @return <b>SourceDescriptiveNote</b>
	 */
	SourceDescriptiveNote getSourceDescriptiveNote(Node node);
}
