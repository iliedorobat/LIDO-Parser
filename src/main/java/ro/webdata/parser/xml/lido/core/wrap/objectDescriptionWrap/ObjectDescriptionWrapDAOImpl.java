package ro.webdata.parser.xml.lido.core.wrap.objectDescriptionWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.objectDescriptionSet.ObjectDescriptionSet;
import ro.webdata.parser.xml.lido.core.set.objectDescriptionSet.ObjectDescriptionSetDAO;
import ro.webdata.parser.xml.lido.core.set.objectDescriptionSet.ObjectDescriptionSetDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ObjectDescriptionWrapDAOImpl implements ObjectDescriptionWrapDAO {
    private static ObjectDescriptionSetDAO objectDescriptionSetParser = new ObjectDescriptionSetDAOImpl();

    public ObjectDescriptionWrap getObjectDescriptionWrap(Node node) {
        List<ObjectDescriptionSet> objectDescriptionSetList = new ArrayList<ObjectDescriptionSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:objectDescriptionSet")) {
                objectDescriptionSetList.add(objectDescriptionSetParser.getObjectDescriptionSet(child));
            }
        }

        return new ObjectDescriptionWrap(objectDescriptionSetList);
    }
}
