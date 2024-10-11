package ro.webdata.parser.xml.lido.core.leaf.subjectObject;

import org.w3c.dom.Node;

public interface SubjectObjectDAO {
	/**
	 *
	 * @param node <b>lido:subjectObject</b> node type.
	 * @return <b>SubjectObject</b>
	 */
	SubjectObject getSubjectObject(Node node);
}
