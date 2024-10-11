package ro.webdata.parser.xml.lido.core.wrap.objectMeasurementsWrap;

import org.w3c.dom.Node;

public interface ObjectMeasurementsWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsWrap</b> node type.
	 * @return <b>ObjectMeasurementsWrap</b>
	 */
	ObjectMeasurementsWrap getObjectMeasurementsWrap(Node node);
}
