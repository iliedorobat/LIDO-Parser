package ro.webdata.lido.parser.core.wrap.repositoryWrap;

import org.w3c.dom.Node;

public interface RepositoryWrapDAO {
	/**
	 *
	 * @param node <b>lido:repositoryWrap</b> node type.
	 * @return <b>RepositoryWrap</b>
	 */
	RepositoryWrap getRepositoryWrap(Node node);
}
