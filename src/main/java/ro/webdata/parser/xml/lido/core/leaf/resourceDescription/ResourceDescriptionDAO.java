package ro.webdata.parser.xml.lido.core.leaf.resourceDescription;

import org.w3c.dom.Node;

public interface ResourceDescriptionDAO {
	/**
	 *
	 * @param node <b>lido:resourceDescription</b> node type.
	 * @return <b>ResourceDescription</b>
	 */
	ResourceDescription getResourceDescription(Node node);
}
