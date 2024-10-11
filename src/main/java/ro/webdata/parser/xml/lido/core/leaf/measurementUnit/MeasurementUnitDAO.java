package ro.webdata.parser.xml.lido.core.leaf.measurementUnit;

import org.w3c.dom.Node;

public interface MeasurementUnitDAO {
	/**
	 *
	 * @param node <b>lido:measurementUnit</b> node type.
	 * @return <b>MeasurementUnit</b>
	 */
	MeasurementUnit getMeasurementUnit(Node node);
}
