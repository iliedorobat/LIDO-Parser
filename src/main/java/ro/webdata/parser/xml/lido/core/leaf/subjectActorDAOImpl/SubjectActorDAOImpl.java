package ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.actorSetComplexType.ActorSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.actorSetComplexType.ActorSetComplexTypeDAOImpl;

import java.util.Map;

public class SubjectActorDAOImpl implements SubjectActorDAO {
    private static ActorSetComplexTypeDAO actorSetComplexTypeDAO = new ActorSetComplexTypeDAOImpl();

    public SubjectActor getSubjectActor(Node node) {
        Map<String, String> attributes = Graph.getAttributes(node);

        return new SubjectActor(
                actorSetComplexTypeDAO.getActorSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
