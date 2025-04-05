package ro.webdata.parser.xml.lido.core.leaf.eventActor;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.actorInRoleSetComplexType.ActorInRoleSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.actorInRoleSetComplexType.ActorInRoleSetComplexTypeDAOImpl;

import java.util.Map;

public class EventActorDAOImpl implements EventActorDAO {
    private ActorInRoleSetComplexTypeDAO actorInRoleSetComplexTypeDAO = new ActorInRoleSetComplexTypeDAOImpl();

    public EventActor getEventActor(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new EventActor(
                actorInRoleSetComplexTypeDAO.getActorInRoleSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
