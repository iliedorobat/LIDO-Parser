package ro.webdata.parser.xml.lido.core.leaf.measurementValue;

import org.w3c.dom.Node;

public interface MeasurementValueDAO {
	/**
	 *
	 * @param node <b>lido:measurementValue</b> node type.
	 * @return <b>MeasurementValue</b>
	 */
	MeasurementValue getMeasurementValue(Node node);
}
