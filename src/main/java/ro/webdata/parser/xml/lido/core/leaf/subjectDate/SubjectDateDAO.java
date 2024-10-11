package ro.webdata.parser.xml.lido.core.leaf.subjectDate;

import org.w3c.dom.Node;

public interface SubjectDateDAO {
	/**
	 *
	 * @param node <b>lido:subjectDate</b> node type.
	 * @return <b>SubjectDate</b>
	 */
	SubjectDate getSubjectDate(Node node);
}
