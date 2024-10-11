package ro.webdata.parser.xml.lido.core.leaf.periodName;

import org.w3c.dom.Node;

public interface PeriodNameDAO {
	/**
	 *
	 * @param node <b>lido:periodName</b> node type.
	 * @return <b>PeriodName</b>
	 */
	PeriodName getPeriodName(Node node);
}
