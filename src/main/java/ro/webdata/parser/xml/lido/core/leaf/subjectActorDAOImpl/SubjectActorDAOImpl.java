package ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.complex.actorSetComplexType.ActorSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.actorSetComplexType.ActorSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectActorDAOImpl implements SubjectActorDAO {
    private static ActorSetComplexTypeDAO actorSetComplexTypeDAO = new ActorSetComplexTypeDAOImpl();

    public SubjectActor getSubjectActor(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new SubjectActor(
                actorSetComplexTypeDAO.getActorSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
