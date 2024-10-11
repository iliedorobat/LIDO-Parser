package ro.webdata.parser.xml.lido.core.leaf.recordType;

import org.w3c.dom.Node;

public interface RecordTypeDAO {
	/**
	 *
	 * @param node <b>lido:recordType</b> node type.
	 * @return <b>RecordType</b>
	 */
	RecordType getRecordType(Node node);
}
