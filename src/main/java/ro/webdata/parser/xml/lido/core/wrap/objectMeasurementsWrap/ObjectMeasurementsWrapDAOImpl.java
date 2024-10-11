package ro.webdata.parser.xml.lido.core.wrap.objectMeasurementsWrap;

import ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet.ObjectMeasurementsSetDAO;
import ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet.ObjectMeasurementsSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet.ObjectMeasurementsSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectMeasurementsWrapDAOImpl implements ObjectMeasurementsWrapDAO {
    private static ObjectMeasurementsSetDAO objectMeasurementsSetParser = new ObjectMeasurementsSetDAOImpl();

    public ObjectMeasurementsWrap getObjectMeasurementsWrap(Node node) {
        ArrayList<ObjectMeasurementsSet> objectMeasurementsSetList = new ArrayList<ObjectMeasurementsSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:objectMeasurementsSet")) {
                objectMeasurementsSetList.add(objectMeasurementsSetParser.getObjectMeasurementsSet(child));
            }
        }

        return new ObjectMeasurementsWrap(objectMeasurementsSetList);
    }
}
