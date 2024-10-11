package ro.webdata.parser.xml.lido.core.complex.measurementsSetComplexType;

import org.w3c.dom.Node;

public interface MeasurementsSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:measurementsSetComplexType</b> node type.
	 * @return <b>MeasurementsSetComplexType</b>
	 */
	MeasurementsSetComplexType getMeasurementsSetComplexType(Node node);
}
