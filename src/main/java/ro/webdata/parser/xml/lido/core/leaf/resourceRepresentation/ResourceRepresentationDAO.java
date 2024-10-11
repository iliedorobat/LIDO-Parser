package ro.webdata.parser.xml.lido.core.leaf.resourceRepresentation;

import org.w3c.dom.Node;

public interface ResourceRepresentationDAO {
	/**
	 *
	 * @param node <b>lido:resourceRepresentation</b> node type.
	 * @return <b>ResourceRepresentation</b>
	 */
	ResourceRepresentation getResourceRepresentation(Node node);
}
