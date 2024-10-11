package ro.webdata.parser.xml.lido.core.leaf.subjectEvent;

import org.w3c.dom.Node;

public interface SubjectEventDAO {
	/**
	 *
	 * @param node <b>lido:subjectEvent</b> node type.
	 * @return <b>SubjectEvent</b>
	 */
	SubjectEvent getSubjectEvent(Node node);
}
