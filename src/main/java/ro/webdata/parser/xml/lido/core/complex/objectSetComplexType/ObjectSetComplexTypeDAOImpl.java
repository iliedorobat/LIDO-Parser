package ro.webdata.parser.xml.lido.core.complex.objectSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.displayObject.DisplayObjectDAO;
import ro.webdata.parser.xml.lido.core.leaf.object.ObjectDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayObject.DisplayObjectDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.object.ObjectDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayObject.DisplayObject;
import ro.webdata.parser.xml.lido.core.leaf.object.Object;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectSetComplexTypeDAOImpl implements ObjectSetComplexTypeDAO {
    private static DisplayObjectDAO displayObjectParser = new DisplayObjectDAOImpl();
    private static ObjectDAO objectParser = new ObjectDAOImpl();

    public ObjectSetComplexType getObjectSetComplexType(Node node) {
        ArrayList<DisplayObject> displayObjectList = new ArrayList<DisplayObject>();
        Object object = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayObject":
                    displayObjectList.add(displayObjectParser.getDisplayObject(child));
                    break;
                case "lido:object":
                    object = objectParser.getObject(child);
                    break;
                default: break;
            }
        }

        return new ObjectSetComplexType(displayObjectList, object);
    }
}
