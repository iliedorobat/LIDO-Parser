package ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap;

import org.w3c.dom.Node;

public interface RightsWorkWrapDAO {
	/**
	 *
	 * @param node <b>lido:rightsWorkWrap</b> node type.
	 * @return <b>RightsWorkWrap</b>
	 */
	RightsWorkWrap getRightsWorkWrapParser(Node node);
}
