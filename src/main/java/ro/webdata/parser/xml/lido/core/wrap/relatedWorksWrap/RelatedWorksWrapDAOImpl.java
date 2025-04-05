package ro.webdata.parser.xml.lido.core.wrap.relatedWorksWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSet;
import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSetDAO;
import ro.webdata.parser.xml.lido.core.set.relatedWorkSet.RelatedWorkSetDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class RelatedWorksWrapDAOImpl implements RelatedWorksWrapDAO {
    private static RelatedWorkSetDAO relatedWorkSetParser = new RelatedWorkSetDAOImpl();

    public RelatedWorksWrap getRelatedWorksWrap(Node node) {
        List<RelatedWorkSet> relatedWorkSetList = new ArrayList<RelatedWorkSet>();
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
