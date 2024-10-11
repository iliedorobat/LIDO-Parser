package ro.webdata.parser.xml.lido.core.leaf.scaleMeasurements;

import org.w3c.dom.Node;

public interface ScaleMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:scaleMeasurements</b> node type.
	 * @return <b>ScaleMeasurements</b>
	 */
	ScaleMeasurements getScaleMeasurements(Node node);
}
