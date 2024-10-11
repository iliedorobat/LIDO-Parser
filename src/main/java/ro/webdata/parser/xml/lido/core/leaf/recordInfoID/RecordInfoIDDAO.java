package ro.webdata.parser.xml.lido.core.leaf.recordInfoID;

import org.w3c.dom.Node;

public interface RecordInfoIDDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoID</b> node type.
	 * @return <b>RecordInfoID</b>
	 */
	RecordInfoID getRecordInfoID(Node node);
}
