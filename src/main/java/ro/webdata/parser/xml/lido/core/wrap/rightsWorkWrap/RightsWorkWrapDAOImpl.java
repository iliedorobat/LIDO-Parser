package ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.rightsWorkSet.RightsWorkSet;
import ro.webdata.parser.xml.lido.core.set.rightsWorkSet.RightsWorkSetDAO;
import ro.webdata.parser.xml.lido.core.set.rightsWorkSet.RightsWorkSetDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class RightsWorkWrapDAOImpl implements RightsWorkWrapDAO {
    private static RightsWorkSetDAO rightsWorkSetParser = new RightsWorkSetDAOImpl();

    public RightsWorkWrap getRightsWorkWrapParser(Node node) {
        List<RightsWorkSet> rightsWorkSetList = new ArrayList<RightsWorkSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node childNode = childNodeList.item(i);
            String childName = childNode.getNodeName();

            if (childName.equals("lido:rightsWorkSet")) {
                rightsWorkSetList.add(rightsWorkSetParser.getRightsWorkSet(childNode));
            }
        }

        return new RightsWorkWrap(rightsWorkSetList);
    }
}
