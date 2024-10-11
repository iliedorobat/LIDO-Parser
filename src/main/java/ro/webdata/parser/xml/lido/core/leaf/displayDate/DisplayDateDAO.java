package ro.webdata.parser.xml.lido.core.leaf.displayDate;

import org.w3c.dom.Node;

public interface DisplayDateDAO {
	/**
	 *
	 * @param node <b>lido:displayDate</b> node types.
	 * @return <b>DisplayDate</b>
	 */
	DisplayDate getDisplayDate(Node node);
}
