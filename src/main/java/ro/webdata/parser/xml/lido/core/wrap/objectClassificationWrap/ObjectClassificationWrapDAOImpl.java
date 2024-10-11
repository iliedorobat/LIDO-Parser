package ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrapDAOImpl;
import ro.webdata.parser.xml.lido.core.wrap.classificationWrap.ClassificationWrap;
import ro.webdata.parser.xml.lido.core.wrap.classificationWrap.ClassificationWrapDAO;
import ro.webdata.parser.xml.lido.core.wrap.classificationWrap.ClassificationWrapDAOImpl;

public class ObjectClassificationWrapDAOImpl implements ObjectClassificationWrapDAO {
    private static ObjectWorkTypeWrapDAO objectWorkTypeWrapDAO = new ObjectWorkTypeWrapDAOImpl();
    private static ClassificationWrapDAO classificationWrapDAO = new ClassificationWrapDAOImpl();

    public ObjectClassificationWrap getObjectClassificationWrap(Node node) {
        ObjectWorkTypeWrap objectWorkTypeWrap = null;
        ClassificationWrap classificationWrap = null;
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:objectWorkTypeWrap":
                    objectWorkTypeWrap = objectWorkTypeWrapDAO.getObjectWorkTypeWrap(child);
                    break;
                case "lido:classificationWrap":
                    classificationWrap = classificationWrapDAO.getClassificationWrap(child);
                    break;
                default: break;
            }
        }

        return new ObjectClassificationWrap(
                objectWorkTypeWrap,
                classificationWrap
        );
    }
}
