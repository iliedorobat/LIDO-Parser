package ro.webdata.parser.xml.lido.core.leaf.recordMetadataDate;

import org.w3c.dom.Node;

public interface RecordMetadataDateDAO {
	/**
	 *
	 * @param node <b>lido:recordMetadataDate</b> node typoe.
	 * @return <b>RecordMetadataDate</b>
	 */
	RecordMetadataDate getRecordMetadataDate(Node node);
}
