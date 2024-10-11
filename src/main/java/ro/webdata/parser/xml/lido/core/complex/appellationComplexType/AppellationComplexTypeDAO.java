package ro.webdata.parser.xml.lido.core.complex.appellationComplexType;

import org.w3c.dom.Node;

public interface AppellationComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:appellationComplexType</b> node type.
	 * @return <b>AppellationComplexType</b>
	 */
	AppellationComplexType getAppellationComplexType(Node node);
}
