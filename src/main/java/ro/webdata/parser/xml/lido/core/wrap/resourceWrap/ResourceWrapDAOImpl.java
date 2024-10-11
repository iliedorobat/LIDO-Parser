package ro.webdata.parser.xml.lido.core.wrap.resourceWrap;

import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSetDAO;
import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ResourceWrapDAOImpl implements ResourceWrapDAO {
    private static ResourceSetDAO resourceSetParser = new ResourceSetDAOImpl();

    public ResourceWrap getResourceWrap(Node node) {
        ArrayList<ResourceSet> resourceSetList = new ArrayList<ResourceSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:resourceSet")) {
                resourceSetList.add(resourceSetParser.getResourceSet(child));
            }
        }

        return new ResourceWrap(resourceSetList);
    }
}
