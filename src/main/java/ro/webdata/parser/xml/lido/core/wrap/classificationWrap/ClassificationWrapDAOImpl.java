package ro.webdata.parser.xml.lido.core.wrap.classificationWrap;

import ro.webdata.parser.xml.lido.core.leaf.classification.ClassificationDAO;
import ro.webdata.parser.xml.lido.core.leaf.classification.ClassificationDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.classification.Classification;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ClassificationWrapDAOImpl implements ClassificationWrapDAO {
    private static ClassificationDAO classificationParser = new ClassificationDAOImpl();

    public ClassificationWrap getClassificationWrap(Node node) {
        ArrayList<Classification> classificationList = new ArrayList<Classification>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:classification")) {
                classificationList.add(classificationParser.getClassification(child));
            }
        }

        return new ClassificationWrap(classificationList);
    }
}
