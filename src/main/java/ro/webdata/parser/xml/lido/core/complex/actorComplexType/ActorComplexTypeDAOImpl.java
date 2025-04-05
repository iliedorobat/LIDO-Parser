package ro.webdata.parser.xml.lido.core.complex.actorComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.actorID.ActorID;
import ro.webdata.parser.xml.lido.core.leaf.actorID.ActorIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.actorID.ActorIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.genderActor.GenderActor;
import ro.webdata.parser.xml.lido.core.leaf.genderActor.GenderActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.genderActor.GenderActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.nationalityActor.NationalityActor;
import ro.webdata.parser.xml.lido.core.leaf.nationalityActor.NationalityActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.nationalityActor.NationalityActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.vitalDatesActor.VitalDatesActor;
import ro.webdata.parser.xml.lido.core.leaf.vitalDatesActor.VitalDatesActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.vitalDatesActor.VitalDatesActorDAOImpl;
import ro.webdata.parser.xml.lido.core.set.nameActorSet.NameActorSet;
import ro.webdata.parser.xml.lido.core.set.nameActorSet.NameActorSetDAO;
import ro.webdata.parser.xml.lido.core.set.nameActorSet.NameActorSetDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ActorComplexTypeDAOImpl implements ActorComplexTypeDAO {
    private static ActorIDDAO actorIDParser = new ActorIDDAOImpl();
    private static NameActorSetDAO nameActorSetParser = new NameActorSetDAOImpl();
    private static NationalityActorDAO nationalityActorParser = new NationalityActorDAOImpl();
    private static VitalDatesActorDAO vitalDatesActorParser = new VitalDatesActorDAOImpl();
    private static GenderActorDAO genderActorParser = new GenderActorDAOImpl();

    public ActorComplexType getActorComplexType(Node node) {
        List<ActorID> actorIDList = new ArrayList<ActorID>();
        List<NameActorSet> nameActorSetList = new ArrayList<NameActorSet>();
        List<NationalityActor> nationalityActorList = new ArrayList<NationalityActor>();
        VitalDatesActor vitalDatesActor = null;
        List<GenderActor> genderActorList = new ArrayList<GenderActor>();
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:actorID":
                    actorIDList.add(actorIDParser.getActorID(child));
                    break;
                case "lido:nameActorSet":
                    nameActorSetList.add(nameActorSetParser.getNameActorSet(child));
                    break;
                case "lido:nationalityActor":
                    nationalityActorList.add(nationalityActorParser.getNationalityActor(child));
                    break;
                case "lido:vitalDatesActor":
                    vitalDatesActor = vitalDatesActorParser.getVitalDatesActor(child);
                    break;
                case "lido:genderActor":
                    genderActorList.add(genderActorParser.getGenderActor(child));
                    break;
                default: break;
            }
        }

        return new ActorComplexType(
                actorIDList, nameActorSetList, nationalityActorList,
                vitalDatesActor, genderActorList,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
