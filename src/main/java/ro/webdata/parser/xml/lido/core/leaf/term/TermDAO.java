package ro.webdata.parser.xml.lido.core.leaf.term;

import org.w3c.dom.Node;

public interface TermDAO {
	/**
	 *
	 * @param node <b>lido:term</b> node type.
	 * @return <b>Term</b>
	 */
	Term getTerm(Node node);
}
