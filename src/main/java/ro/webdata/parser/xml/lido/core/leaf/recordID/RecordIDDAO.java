package ro.webdata.parser.xml.lido.core.leaf.recordID;

import org.w3c.dom.Node;

public interface RecordIDDAO {
	/**
	 *
	 * @param node <b>lido:recordID</b> node type.
	 * @return <b>RecordID</b>
	 */
	RecordID getRecordID(Node node);
}
