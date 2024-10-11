package ro.webdata.parser.xml.lido.core.leaf.actorInRole;

import ro.webdata.parser.xml.lido.core.complex.actorInRoleComplexType.ActorInRoleComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.actorInRoleComplexType.ActorInRoleComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ActorInRoleDAOImpl implements ActorInRoleDAO {
    private static ActorInRoleComplexTypeDAO actorInRoleComplexTypeDAO = new ActorInRoleComplexTypeDAOImpl();

    public ActorInRole getActorInRole(Node node) {
        return new ActorInRole(actorInRoleComplexTypeDAO.getActorInRoleComplexType(node));
    }
}
