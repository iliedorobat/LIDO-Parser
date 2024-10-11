package ro.webdata.parser.xml.lido.core.complex.subjectComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.leaf.extentSubject.ExtentSubject;
import ro.webdata.parser.xml.lido.core.leaf.extentSubject.ExtentSubjectDAO;
import ro.webdata.parser.xml.lido.core.leaf.extentSubject.ExtentSubjectDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl.SubjectActor;
import ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl.SubjectActorDAO;
import ro.webdata.parser.xml.lido.core.leaf.subjectActorDAOImpl.SubjectActorDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subjectConcept.SubjectConcept;
import ro.webdata.parser.xml.lido.core.leaf.subjectConcept.SubjectConceptDAO;
import ro.webdata.parser.xml.lido.core.leaf.subjectConcept.SubjectConceptDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subjectDate.SubjectDate;
import ro.webdata.parser.xml.lido.core.leaf.subjectDate.SubjectDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.subjectDate.SubjectDateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subjectEvent.SubjectEvent;
import ro.webdata.parser.xml.lido.core.leaf.subjectEvent.SubjectEventDAO;
import ro.webdata.parser.xml.lido.core.leaf.subjectEvent.SubjectEventDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subjectObject.SubjectObject;
import ro.webdata.parser.xml.lido.core.leaf.subjectObject.SubjectObjectDAO;
import ro.webdata.parser.xml.lido.core.leaf.subjectObject.SubjectObjectDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.subjectPlace.SubjectPlace;
import ro.webdata.parser.xml.lido.core.leaf.subjectPlace.SubjectPlaceDAO;
import ro.webdata.parser.xml.lido.core.leaf.subjectPlace.SubjectPlaceDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;

import java.util.ArrayList;
import java.util.HashMap;

public class SubjectComplexTypeDAOImpl implements SubjectComplexTypeDAO {
    private static ExtentSubjectDAO extentSubject = new ExtentSubjectDAOImpl();
    private static SubjectConceptDAO subjectConcept = new SubjectConceptDAOImpl();
    private static SubjectActorDAO subjectActor = new SubjectActorDAOImpl();
    private static SubjectDateDAO subjectDate = new SubjectDateDAOImpl();
    private static SubjectEventDAO subjectEvent = new SubjectEventDAOImpl();
    private static SubjectPlaceDAO subjectPlace = new SubjectPlaceDAOImpl();
    private static SubjectObjectDAO subjectObject = new SubjectObjectDAOImpl();

    public SubjectComplexType getSubjectComplexType(Node node) {
        ArrayList<ExtentSubject> extentSubjectList = new ArrayList<ExtentSubject>();
        ArrayList<SubjectConcept> subjectConceptList = new ArrayList<SubjectConcept>();
        ArrayList<SubjectActor> subjectActorList = new ArrayList<SubjectActor>();
        ArrayList<SubjectDate> subjectDateList = new ArrayList<SubjectDate>();
        ArrayList<SubjectEvent> subjectEventList = new ArrayList<SubjectEvent>();
        ArrayList<SubjectPlace> subjectPlaceList = new ArrayList<SubjectPlace>();
        ArrayList<SubjectObject> subjectObjectList = new ArrayList<SubjectObject>();
        HashMap<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:extentSubject":
                    extentSubjectList.add(extentSubject.getExtentSubject(child));
                    break;
                case "lido:subjectConcept":
                    subjectConceptList.add(subjectConcept.getSubjectConcept(child));
                    break;
                case "lido:subjectActor":
                    subjectActorList.add(subjectActor.getSubjectActor(child));
                    break;
                case "lido:subjectDate":
                    subjectDateList.add(subjectDate.getSubjectDate(child));
                    break;
                case "lido:subjectEvent":
                    subjectEventList.add(subjectEvent.getSubjectEvent(child));
                    break;
                case "lido:subjectPlace":
                    subjectPlaceList.add(subjectPlace.getSubjectPlace(child));
                    break;
                case "lido:subjectObject":
                    subjectObjectList.add(subjectObject.getSubjectObject(child));
                    break;
                default: break;
            }
        }

        return new SubjectComplexType(
                extentSubjectList, subjectConceptList,
                subjectActorList, subjectDateList,
                subjectEventList, subjectPlaceList,
                subjectObjectList,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
