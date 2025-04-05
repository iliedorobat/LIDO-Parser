package ro.webdata.parser.xml.lido.core.complex.actorSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.actor.Actor;
import ro.webdata.parser.xml.lido.core.leaf.actor.ActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.actor.ActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayActor.DisplayActor;
import ro.webdata.parser.xml.lido.core.leaf.displayActor.DisplayActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayActor.DisplayActorDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ActorSetComplexTypeDAOImpl implements ActorSetComplexTypeDAO {
    private static DisplayActorDAO displayActorParser = new DisplayActorDAOImpl();
    private static ActorDAO actorParser = new ActorDAOImpl();

    public ActorSetComplexType getActorSetComplexType(Node node) {
        List<DisplayActor> displayActorList = new ArrayList<DisplayActor>();
        Actor actor = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayActor":
                    displayActorList.add(displayActorParser.getDisplayActor(child));
                    break;
                case "lido:actor":
                    actor = actorParser.getActor(child);
                    break;
                default: break;
            }
        }

        return new ActorSetComplexType(displayActorList, actor);
    }
}
