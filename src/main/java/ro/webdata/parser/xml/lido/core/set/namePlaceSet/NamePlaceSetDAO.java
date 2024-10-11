package ro.webdata.parser.xml.lido.core.set.namePlaceSet;

import org.w3c.dom.Node;

public interface NamePlaceSetDAO {
	/**
	 *
	 * @param node <b>lido:namePlaceSet</b> node type.
	 * @return <b>NamePlaceSet</b>
	 */
	NamePlaceSet getNamePlaceSet(Node node);
}
