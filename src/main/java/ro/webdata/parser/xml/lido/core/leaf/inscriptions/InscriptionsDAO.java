package ro.webdata.parser.xml.lido.core.leaf.inscriptions;

import org.w3c.dom.Node;

public interface InscriptionsDAO {
	/**
	 *
	 * @param node <b>lido:inscriptions</b> node type.
	 * @return <b>Inscriptions</b>
	 */
	Inscriptions getInscriptions(Node node);
}
