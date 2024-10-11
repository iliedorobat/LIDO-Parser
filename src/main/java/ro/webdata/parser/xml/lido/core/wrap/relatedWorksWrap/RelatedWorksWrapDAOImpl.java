package ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap;

import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSetDAO;
import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RelatedWorksWrapDAOImpl implements RelatedWorksWrapDAO {
    private static RelatedWorkSetDAO relatedWorkSetParser = new RelatedWorkSetDAOImpl();

    public RelatedWorksWrap getRelatedWorksWrap(Node node) {
        ArrayList<RelatedWorkSet> relatedWorkSetList = new ArrayList<RelatedWorkSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node childNode = childNodeList.item(i);
            String childName = childNode.getNodeName();

            if (childName.equals("lido:rightsWorkSet")) {
                relatedWorkSetList.add(relatedWorkSetParser.getRelatedWorkSet(childNode));
            }
        }

        return new RelatedWorksWrap(relatedWorkSetList);
    }
}
