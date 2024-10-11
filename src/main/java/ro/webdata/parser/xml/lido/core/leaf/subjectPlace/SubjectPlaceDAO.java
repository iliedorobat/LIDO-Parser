package ro.webdata.parser.xml.lido.core.leaf.subjectPlace;

import org.w3c.dom.Node;

public interface SubjectPlaceDAO {
	/**
	 *
	 * @param node <b>lido:subjectPlace</b> node type.
	 * @return <b>SubjectPlace</b>
	 */
	SubjectPlace getSubjectPlace(Node node);
}
