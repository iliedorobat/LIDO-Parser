package ro.webdata.parser.xml.lido.core.complex.termComplexType;

import org.w3c.dom.Node;

public interface TermComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:termComplexType</b> node type.
	 * @return <b>TermComplexType</b>
	 */
	TermComplexType getTermComplexType(Node node);
}
