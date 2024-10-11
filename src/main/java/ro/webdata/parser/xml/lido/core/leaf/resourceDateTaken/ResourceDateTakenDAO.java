package ro.webdata.parser.xml.lido.core.leaf.resourceDateTaken;

import org.w3c.dom.Node;

public interface ResourceDateTakenDAO {
	/**
	 *
	 * @param node <b>lido:resourceDateTaken</b> node type.
	 * @return <b>ResourceDateTaken</b>
	 */
	ResourceDateTaken getDateSetComplexType(Node node);
}
