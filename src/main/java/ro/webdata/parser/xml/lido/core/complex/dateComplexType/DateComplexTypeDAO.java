package ro.webdata.parser.xml.lido.core.complex.dateComplexType;

import org.w3c.dom.Node;

public interface DateComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsDate</b> node type.
	 * @return <b>DateComplexType</b>
	 */
	DateComplexType getDateComplexType(Node node);
}
