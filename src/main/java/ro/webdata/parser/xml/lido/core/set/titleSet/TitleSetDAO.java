package ro.webdata.parser.xml.lido.core.set.titleSet;

import org.w3c.dom.Node;

public interface TitleSetDAO {
	/**
	 *
	 * @param node <b>lido:titleSet</b> node type.
	 * @return <b>TitleSet</b>
	 */
	TitleSet getTitleSet(Node node);
}
