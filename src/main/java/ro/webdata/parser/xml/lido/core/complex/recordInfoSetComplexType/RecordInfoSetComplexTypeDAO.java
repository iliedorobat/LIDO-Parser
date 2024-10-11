package ro.webdata.parser.xml.lido.core.complex.recordInfoSetComplexType;

import org.w3c.dom.Node;

public interface RecordInfoSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoSetComplexType</b> node type.
	 * @return <b>RecordInfoSetComplexType</b>
	 */
	RecordInfoSetComplexType getRecordInfoSetComplexType(Node node);
}
