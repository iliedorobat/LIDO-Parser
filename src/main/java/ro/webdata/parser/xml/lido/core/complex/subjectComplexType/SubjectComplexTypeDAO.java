package ro.webdata.parser.xml.lido.core.complex.subjectComplexType;

import org.w3c.dom.Node;

public interface SubjectComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:subjectComplexType</b> node type.
	 * @return <b>SubjectComplexType</b>
	 */
	SubjectComplexType getSubjectComplexType(Node node);
}
