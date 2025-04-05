package ro.webdata.parser.xml.lido.core.wrap.resourceWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSet;
import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSetDAO;
import ro.webdata.parser.xml.lido.core.set.resourceSet.ResourceSetDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ResourceWrapDAOImpl implements ResourceWrapDAO {
    private static ResourceSetDAO resourceSetParser = new ResourceSetDAOImpl();

    public ResourceWrap getResourceWrap(Node node) {
        List<ResourceSet> resourceSetList = new ArrayList<ResourceSet>();
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
