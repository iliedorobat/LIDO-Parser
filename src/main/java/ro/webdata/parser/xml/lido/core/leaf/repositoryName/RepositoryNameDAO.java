package ro.webdata.parser.xml.lido.core.leaf.repositoryName;

import org.w3c.dom.Node;

public interface RepositoryNameDAO {
	/**
	 *
	 * @param node <b>lido:repositoryName</b> node type.
	 * @return <b>RepositoryName</b>
	 */
	RepositoryName getRepositoryName(Node node);
}
