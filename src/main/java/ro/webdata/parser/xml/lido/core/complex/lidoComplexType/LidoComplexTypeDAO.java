package ro.webdata.parser.xml.lido.core.complex.lidoComplexType;

import org.w3c.dom.Node;

public interface LidoComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:lidoComplexType</b> node type.
	 * @return <b>LidoComplexType</b>
	 */
	LidoComplexType getLidoComplexType(Node node);
}
