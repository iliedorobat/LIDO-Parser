package ro.webdata.parser.xml.lido.core.leaf.gml;

import org.w3c.dom.Node;

public interface GmlDAO {
	/**
	 *
	 * @param node <b>lido:gml</b> node type.
	 * @return <b>Gml</b>
	 */
	Gml getGml(Node node);
}
