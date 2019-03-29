package ro.webdata.lido.parser.core.leaf.subjectActorDAOImpl;

import org.w3c.dom.Node;

public interface SubjectActorDAO {
	/**
	 *
	 * @param node <b>lido:subjectActor</b> node type.
	 * @return <b>SubjectActor</b>
	 */
	SubjectActor getSubjectActor(Node node);
}