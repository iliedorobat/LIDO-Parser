package ro.webdata.parser.xml.lido.core.complex.actorInRoleSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.actorInRole.ActorInRole;
import ro.webdata.parser.xml.lido.core.leaf.actorInRole.ActorInRoleDAO;
import ro.webdata.parser.xml.lido.core.leaf.actorInRole.ActorInRoleDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayActorInRole.DisplayActorInRole;
import ro.webdata.parser.xml.lido.core.leaf.displayActorInRole.DisplayActorInRoleDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayActorInRole.DisplayActorInRoleDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ActorInRoleSetComplexTypeDAOImpl implements ActorInRoleSetComplexTypeDAO {
    private static DisplayActorInRoleDAO displayActorInRoleParser = new DisplayActorInRoleDAOImpl();
    private static ActorInRoleDAO actorInRoleParser = new ActorInRoleDAOImpl();

    public ActorInRoleSetComplexType getActorInRoleSetComplexType(Node node) {
        List<DisplayActorInRole> displayActorInRoleList = new ArrayList<DisplayActorInRole>();
        ActorInRole actorInRole = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayActorInRole":
                    displayActorInRoleList.add(displayActorInRoleParser.getDisplayActorInRole(child));
                    break;
                case "lido:actorInRole":
                    actorInRole = actorInRoleParser.getActorInRole(child);
                    break;
                default: break;
            }
        }

        return new ActorInRoleSetComplexType(displayActorInRoleList, actorInRole);
    }
}
