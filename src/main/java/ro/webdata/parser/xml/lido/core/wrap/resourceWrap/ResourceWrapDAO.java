package ro.webdata.parser.xml.lido.core.wrap.resourceWrap;

import org.w3c.dom.Node;

public interface ResourceWrapDAO {
	/**
	 *
	 * @param node <b>lido:resourceWrap</b> node type.
	 * @return <b>ResourceWrap</b>
	 */
	ResourceWrap getResourceWrap(Node node);
}
