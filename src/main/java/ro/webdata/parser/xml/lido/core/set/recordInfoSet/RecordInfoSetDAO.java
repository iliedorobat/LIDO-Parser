package ro.webdata.parser.xml.lido.core.set.recordInfoSet;

import org.w3c.dom.Node;

public interface RecordInfoSetDAO {
	/**
	 *
	 * @param node <b>lido:recordRights</b> node type.
	 * @return <b>RecordInfoSet</b>
	 */
	RecordInfoSet getRecordInfoSet(Node node);
}
