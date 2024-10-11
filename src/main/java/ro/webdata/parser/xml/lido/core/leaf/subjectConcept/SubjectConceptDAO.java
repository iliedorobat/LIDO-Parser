package ro.webdata.parser.xml.lido.core.leaf.subjectConcept;

import org.w3c.dom.Node;

public interface SubjectConceptDAO {
	/**
	 *
	 * @param node <b>lido:subjectConcept</b> node type.
	 * @return <b>SubjectConcept</b>
	 */
	SubjectConcept getSubjectConcept(Node node);
}
