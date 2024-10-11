package ro.webdata.parser.xml.lido.core.wrap.inscriptionsWrap;

import org.w3c.dom.Node;

public interface InscriptionsWrapDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionsWrap</b> node type.
	 * @return <b>InscriptionsWrap</b>
	 */
	InscriptionsWrap getInscriptionsWrap(Node node);
}
