package ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet;

import org.w3c.dom.Node;

public interface ObjectMeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsSet</b> node type.
	 * @return <b>ObjectMeasurementsSet</b>
	 */
	ObjectMeasurementsSet getObjectMeasurementsSet(Node node);
}
