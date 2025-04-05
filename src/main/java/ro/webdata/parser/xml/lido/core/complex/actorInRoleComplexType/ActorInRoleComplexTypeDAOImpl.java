package ro.webdata.parser.xml.lido.core.complex.actorInRoleComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.actor.Actor;
import ro.webdata.parser.xml.lido.core.leaf.actor.ActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.actor.ActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor.AttributionQualifierActor;
import ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor.AttributionQualifierActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.attributionQualifierActor.AttributionQualifierActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.extentActor.ExtentActor;
import ro.webdata.parser.xml.lido.core.leaf.extentActor.ExtentActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.extentActor.ExtentActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.roleActor.RoleActor;
import ro.webdata.parser.xml.lido.core.leaf.roleActor.RoleActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.roleActor.RoleActorDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ActorInRoleComplexTypeDAOImpl implements ActorInRoleComplexTypeDAO {
    private static ActorDAO actorParser = new ActorDAOImpl();
    private static RoleActorDAO roleActorParser = new RoleActorDAOImpl();
    private static AttributionQualifierActorDAO attributionQualifierActorParser = new AttributionQualifierActorDAOImpl();
    private static ExtentActorDAO extentActorParser = new ExtentActorDAOImpl();

    public ActorInRoleComplexType getActorInRoleComplexType(Node node) {
        Actor actor = null;
        List<RoleActor> roleActorList = new ArrayList<RoleActor>();
        List<AttributionQualifierActor> attributionQualifierActorList = new ArrayList<AttributionQualifierActor>();
        List<ExtentActor> extentActorList = new ArrayList<ExtentActor>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:actor":
                    actor = actorParser.getActor(child);
                    break;
                case "lido:roleActor":
                    roleActorList.add(roleActorParser.getRoleActor(child));
                    break;
                case "lido:attributionQualifierActor":
                    attributionQualifierActorList.add(attributionQualifierActorParser.getAttributionQualifierActor(child));
                    break;
                case "lido:extentActor":
                    extentActorList.add(extentActorParser.getExtentActor(child));
                    break;
                default: break;
            }
        }

        return new ActorInRoleComplexType(
                actor, roleActorList,
                attributionQualifierActorList,
                extentActorList
        );
    }
}
