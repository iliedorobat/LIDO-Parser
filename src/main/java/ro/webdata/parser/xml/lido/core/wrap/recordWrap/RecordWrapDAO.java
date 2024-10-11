package ro.webdata.parser.xml.lido.core.wrap.recordWrap;

import org.w3c.dom.Node;

public interface RecordWrapDAO {
	/**
	 *
	 * @param node <b>lido:recordWrap</b> node type.
	 * @return <b>RecordWrap</b>
	 */
	RecordWrap getRecordWrap(Node node);
}
