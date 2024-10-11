package ro.webdata.parser.xml.lido.core.complex.objectMeasurementsComplexType;

import org.w3c.dom.Node;

public interface ObjectMeasurementsComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsComplexType</b> node type.
	 * @return <b>ObjectMeasurementsComplexType</b>
	 */
	ObjectMeasurementsComplexType getObjectMeasurementsComplexType(Node node);
}
