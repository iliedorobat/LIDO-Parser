package ro.webdata.parser.xml.lido.core.complex.objectMeasurementsSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.displayObjectMeasurements.DisplayObjectMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.objectMeasurements.ObjectMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayObjectMeasurements.DisplayObjectMeasurementsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.objectMeasurements.ObjectMeasurementsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayObjectMeasurements.DisplayObjectMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.objectMeasurements.ObjectMeasurements;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectMeasurementsSetComplexTypeDAOImpl implements ObjectMeasurementsSetComplexTypeDAO {
    private static DisplayObjectMeasurementsDAO displayObjectMeasurementsParser = new DisplayObjectMeasurementsDAOImpl();
    private static ObjectMeasurementsDAO objectMeasurementsParser = new ObjectMeasurementsDAOImpl();

    public ObjectMeasurementsSetComplexType getObjectMeasurementsSetComplexType(Node node) {
        ArrayList<DisplayObjectMeasurements> displayObjectMeasurementsList = new ArrayList<DisplayObjectMeasurements>();
        ObjectMeasurements objectMeasurements = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayObjectMeasurements":
                    displayObjectMeasurementsList.add(displayObjectMeasurementsParser.getDisplayObjectMeasurements(child));
                    break;
                case "lido:objectMeasurements":
                    objectMeasurements = objectMeasurementsParser.getObjectMeasurements(child);
                    break;
                default: break;
            }
        }

        return new ObjectMeasurementsSetComplexType(
                displayObjectMeasurementsList,
                objectMeasurements
        );
    }
}
