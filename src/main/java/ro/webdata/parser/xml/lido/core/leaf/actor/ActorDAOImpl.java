package ro.webdata.parser.xml.lido.core.leaf.actor;

import ro.webdata.parser.xml.lido.core.complex.actorComplexType.ActorComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.actorComplexType.ActorComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ActorDAOImpl implements ActorDAO {
    private ActorComplexTypeDAO actorComplexTypeDAO = new ActorComplexTypeDAOImpl();

    public Actor getActor(Node node) {
        return new Actor(actorComplexTypeDAO.getActorComplexType(node));
    }
}
