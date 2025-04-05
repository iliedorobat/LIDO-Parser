package ro.webdata.parser.xml.lido.core.wrap.classificationWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.classification.Classification;
import ro.webdata.parser.xml.lido.core.leaf.classification.ClassificationDAO;
import ro.webdata.parser.xml.lido.core.leaf.classification.ClassificationDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ClassificationWrapDAOImpl implements ClassificationWrapDAO {
    private static ClassificationDAO classificationParser = new ClassificationDAOImpl();

    public ClassificationWrap getClassificationWrap(Node node) {
        List<Classification> classificationList = new ArrayList<Classification>();
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
