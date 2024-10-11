package ro.webdata.parser.xml.lido.core.wrap.titleWrap;

import org.w3c.dom.Node;

public interface TitleWrapDAO {
	/**
	 *
	 * @param node <b>lido:titleWrap</b> node type.
	 * @return <b>TitleWrap</b>
	 */
	TitleWrap getTitleWrap(Node node);
}
