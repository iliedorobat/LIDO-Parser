package ro.webdata.parser.xml.lido.core.leaf.displaySubject;

import org.w3c.dom.Node;

public interface DisplaySubjectDAO {
	/**
	 *
	 * @param node <b>lido:displaySubject</b> node type.
	 * @return <b>DisplaySubject</b>
	 */
	DisplaySubject getDisplaySubject(Node node);
}
