package ro.webdata.parser.xml.lido.core.leaf.subject;

import org.w3c.dom.Node;

public interface SubjectDAO {
	/**
	 *
	 * @param node <b>lido:subject</b> node type.
	 * @return <b>SubjectDAO</b>
	 */
	Subject getSubject(Node node);
}
