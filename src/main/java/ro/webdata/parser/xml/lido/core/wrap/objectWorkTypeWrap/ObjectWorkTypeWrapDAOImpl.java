package ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.objectWorkType.ObjectWorkType;
import ro.webdata.parser.xml.lido.core.leaf.objectWorkType.ObjectWorkTypeDAO;
import ro.webdata.parser.xml.lido.core.leaf.objectWorkType.ObjectWorkTypeDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ObjectWorkTypeWrapDAOImpl implements ObjectWorkTypeWrapDAO {
    private static ObjectWorkTypeDAO objectWorkTypeParser = new ObjectWorkTypeDAOImpl();

    public ObjectWorkTypeWrap getObjectWorkTypeWrap(Node node) {
        List<ObjectWorkType> objectWorkTypeList = new ArrayList<ObjectWorkType>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childNodeName = child.getNodeName();

            if (childNodeName.equals("lido:objectWorkType")) {
                objectWorkTypeList.add(objectWorkTypeParser.getObjectWorkType(child));
            }
        }

        return new ObjectWorkTypeWrap(objectWorkTypeList);
    }
}
