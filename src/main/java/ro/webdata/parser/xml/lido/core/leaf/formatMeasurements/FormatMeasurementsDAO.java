package ro.webdata.parser.xml.lido.core.leaf.formatMeasurements;

import org.w3c.dom.Node;

public interface FormatMeasurementsDAO {
    /**
     *
     * @param node <b>lido:formatMeasurements</b> node type.
     * @return <b>FormatMeasurements</b>
     */
    FormatMeasurements getFormatMeasurements(Node node);
}
