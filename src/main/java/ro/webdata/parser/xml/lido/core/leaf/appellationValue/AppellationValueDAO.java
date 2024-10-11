package ro.webdata.parser.xml.lido.core.leaf.appellationValue;

import org.w3c.dom.Node;

public interface AppellationValueDAO {
	/**
	 *
	 * @param node <b>lido:appellationValue</b> node type.
	 * @return <b>AppellationValue</b>
	 */
	AppellationValue getAppellationValue(Node node);
}
