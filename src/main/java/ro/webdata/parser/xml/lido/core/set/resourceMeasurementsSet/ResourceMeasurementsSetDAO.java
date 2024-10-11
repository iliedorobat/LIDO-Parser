package ro.webdata.parser.xml.lido.core.set.resourceMeasurementsSet;

import org.w3c.dom.Node;

public interface ResourceMeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:resourceMeasurementsSet</b> node type.
	 * @return <b>ResourceMeasurementsSet</b>
	 */
	ResourceMeasurementsSet getResourceMeasurementsSet(Node node);
}
