package ro.webdata.parser.xml.lido.core.leaf.objectMeasurements;

import org.w3c.dom.Node;

public interface ObjectMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurements</b> node type.
	 * @return <b>ObjectMeasurements</b>
	 */
	ObjectMeasurements getObjectMeasurements(Node node);
}
