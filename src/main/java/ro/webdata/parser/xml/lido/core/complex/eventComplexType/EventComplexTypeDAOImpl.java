package ro.webdata.parser.xml.lido.core.complex.eventComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.eventDescriptionSet.EventDescriptionSetDAO;
import ro.webdata.parser.xml.lido.core.set.relatedEventSet.RelatedEventSetDAO;
import ro.webdata.parser.xml.lido.core.set.eventDescriptionSet.EventDescriptionSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.relatedEventSet.RelatedEventSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.eventDescriptionSet.EventDescriptionSet;
import ro.webdata.parser.xml.lido.core.set.relatedEventSet.RelatedEventSet;
import ro.webdata.parser.xml.lido.core.leaf.culture.Culture;
import ro.webdata.parser.xml.lido.core.leaf.culture.CultureDAO;
import ro.webdata.parser.xml.lido.core.leaf.culture.CultureDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventActor.EventActor;
import ro.webdata.parser.xml.lido.core.leaf.eventActor.EventActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventActor.EventActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventDate.EventDate;
import ro.webdata.parser.xml.lido.core.leaf.eventDate.EventDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventDate.EventDateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventID.EventID;
import ro.webdata.parser.xml.lido.core.leaf.eventID.EventIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventID.EventIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech.EventMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech.EventMaterialsTechDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech.EventMaterialsTechDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventMethod.EventMethod;
import ro.webdata.parser.xml.lido.core.leaf.eventMethod.EventMethodDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventMethod.EventMethodDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventName.EventName;
import ro.webdata.parser.xml.lido.core.leaf.eventName.EventNameDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventName.EventNameDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventPlace.EventPlace;
import ro.webdata.parser.xml.lido.core.leaf.eventPlace.EventPlaceDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventPlace.EventPlaceDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.eventType.EventType;
import ro.webdata.parser.xml.lido.core.leaf.eventType.EventTypeDAO;
import ro.webdata.parser.xml.lido.core.leaf.eventType.EventTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.periodName.PeriodName;
import ro.webdata.parser.xml.lido.core.leaf.periodName.PeriodNameDAO;
import ro.webdata.parser.xml.lido.core.leaf.periodName.PeriodNameDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.roleInEvent.RoleInEvent;
import ro.webdata.parser.xml.lido.core.leaf.roleInEvent.RoleInEventDAO;
import ro.webdata.parser.xml.lido.core.leaf.roleInEvent.RoleInEventDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.thingPresent.ThingPresent;
import ro.webdata.parser.xml.lido.core.leaf.thingPresent.ThingPresentDAO;
import ro.webdata.parser.xml.lido.core.leaf.thingPresent.ThingPresentDAOImpl;

import java.util.ArrayList;

public class EventComplexTypeDAOImpl implements EventComplexTypeDAO {
    private static EventIDDAO eventIDParser = new EventIDDAOImpl();
    private static EventTypeDAO eventTypeParser = new EventTypeDAOImpl();
    private static RoleInEventDAO roleInEventParser = new RoleInEventDAOImpl();
    private static EventActorDAO eventActorParser = new EventActorDAOImpl();
    private static EventNameDAO eventNameParser = new EventNameDAOImpl();
    private static CultureDAO cultureParser = new CultureDAOImpl();
    private static EventDateDAO eventDateParser = new EventDateDAOImpl();
    private static PeriodNameDAO periodNameParser = new PeriodNameDAOImpl();
    private static EventPlaceDAO eventPlaceParser = new EventPlaceDAOImpl();
    private static EventMethodDAO eventMethodParser = new EventMethodDAOImpl();
    private static EventMaterialsTechDAO eventMaterialsTechParser = new EventMaterialsTechDAOImpl();
    private static ThingPresentDAO thingPresentParser = new ThingPresentDAOImpl();
    private static RelatedEventSetDAO relatedEventSetParser = new RelatedEventSetDAOImpl();
    private static EventDescriptionSetDAO eventDescriptionSetParser = new EventDescriptionSetDAOImpl();

    public EventComplexType getEventComplexType(Node node) {
        ArrayList<EventID> eventIDList = new ArrayList<EventID>();
        EventType eventType = null;
        ArrayList<RoleInEvent> roleInEventList = new ArrayList<RoleInEvent>();
        ArrayList<EventName> eventNameList = new ArrayList<EventName>();
        ArrayList<EventActor> eventActorList = new ArrayList<EventActor>();
        ArrayList<Culture> cultureList = new ArrayList<Culture>();
        EventDate eventDate = null;
        ArrayList<PeriodName> periodNameList = new ArrayList<PeriodName>();
        ArrayList<EventPlace> eventPlaceList = new ArrayList<EventPlace>();
        ArrayList<EventMethod> eventMethodList = new ArrayList<EventMethod>();
        ArrayList<EventMaterialsTech> eventMaterialsTechList = new ArrayList<EventMaterialsTech>();
        ArrayList<ThingPresent> thingPresentList = new ArrayList<ThingPresent>();
        ArrayList<RelatedEventSet> relatedEventSetList = new ArrayList<RelatedEventSet>();
        ArrayList<EventDescriptionSet> eventDescriptionSetList = new ArrayList<EventDescriptionSet>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:eventID":
                    eventIDList.add(eventIDParser.getEventID(child));
                    break;
                case "lido:eventType":
                    eventType = eventTypeParser.getEventType(child);
                    break;
                case "lido:roleInEvent":
                    roleInEventList.add(roleInEventParser.getRoleInEvent(child));
                    break;
                case "lido:eventName":
                    eventNameList.add(eventNameParser.getEventName(child));
                    break;
                case "lido:eventActor":
                    eventActorList.add(eventActorParser.getEventActor(child));
                    break;
                case "lido:culture":
                    cultureList.add(cultureParser.getCulture(child));
                    break;
                case "lido:eventDate":
                    eventDate = eventDateParser.getDisplayEvent(child);
                    break;
                case "lido:periodName":
                    periodNameList.add(periodNameParser.getPeriodName(child));
                    break;
                case "lido:eventPlace":
                    eventPlaceList.add(eventPlaceParser.getEventPlace(child));
                    break;
                case "lido:eventMethod":
                    eventMethodList.add(eventMethodParser.getEventMethod(child));
                    break;
                case "lido:eventMaterialsTech":
                    eventMaterialsTechList.add(eventMaterialsTechParser.getEventMaterialsTech(child));
                    break;
                case "lido:thingPresent":
                    thingPresentList.add(thingPresentParser.getThingPresent(child));
                    break;
                case "lido:relatedEventSet":
                    relatedEventSetList.add(relatedEventSetParser.getRelatedEventSet(child));
                    break;
                case "lido:eventDescriptionSet":
                    eventDescriptionSetList.add(eventDescriptionSetParser.getEventDescriptionSet(child));
                    break;
                default: break;
            }
        }

        return new EventComplexType(
                eventIDList, eventType, roleInEventList, eventNameList,
                eventActorList, cultureList, eventDate, periodNameList,
                eventPlaceList, eventMethodList, eventMaterialsTechList,
                thingPresentList, relatedEventSetList, eventDescriptionSetList
        );
    }
}
