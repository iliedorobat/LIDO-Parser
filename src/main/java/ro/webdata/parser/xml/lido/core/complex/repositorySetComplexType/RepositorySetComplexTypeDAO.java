package ro.webdata.parser.xml.lido.core.complex.repositorySetComplexType;

import org.w3c.dom.Node;

public interface RepositorySetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:repositorySetComplexType</b> node type.
	 * @return <b>RepositorySetComplexType</b>
	 */
	RepositorySetComplexType getRepositorySetComplexType(Node node);
}
