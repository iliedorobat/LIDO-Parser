package ro.webdata.parser.xml.lido.core.leaf.recordSource;

import org.w3c.dom.Node;

public interface RecordSourceDAO {
	/**
	 *
	 * @param node <b>lido:recordSource</b> node type.
	 * @return <b>RecordSource</b>
	 */
	RecordSource getRecordSourceType(Node node);
}
