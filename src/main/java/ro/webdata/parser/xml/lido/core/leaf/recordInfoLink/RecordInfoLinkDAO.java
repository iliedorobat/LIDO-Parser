package ro.webdata.parser.xml.lido.core.leaf.recordInfoLink;

import org.w3c.dom.Node;

public interface RecordInfoLinkDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoLink</b> node type.
	 * @return <b>RecordInfoLink</b>
	 */
	RecordInfoLink getRecordInfoLink(Node node);
}
