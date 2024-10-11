package ro.webdata.parser.xml.lido.core.leaf.shapeMeasurements;

import org.w3c.dom.Node;

public interface ShapeMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:shapeMeasurements</b> node type.
	 * @return <b>ShapeMeasurements</b>
	 */
	ShapeMeasurements getShapeMeasurements(Node node);
}
