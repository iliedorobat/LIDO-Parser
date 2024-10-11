package ro.webdata.parser.xml.lido.core.leaf.inscriptions;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscription;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscriptionDAO;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscriptionDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescription;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescriptionDAO;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescriptionDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class InscriptionsDAOImpl implements InscriptionsDAO {
    private static InscriptionTranscriptionDAO inscriptionTranscriptionParser = new InscriptionTranscriptionDAOImpl();
    private static InscriptionDescriptionDAO inscriptionDescriptionParser = new InscriptionDescriptionDAOImpl();

    //TODO: create the InscriptionsComplexTypeDAO (artificial class) to extend the class
    public Inscriptions getInscriptions(Node node) {
        ArrayList<InscriptionTranscription> inscriptionTranscriptionList = new ArrayList<InscriptionTranscription>();
        ArrayList<InscriptionDescription> inscriptionDescriptionList = new ArrayList<InscriptionDescription>();
        HashMap<String, String> attributes = Graph.getAttributes(node);
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:inscriptionTranscription":
                    inscriptionTranscriptionList.add(inscriptionTranscriptionParser.getInscriptionTranscription(child));
                    break;
                case "lido:inscriptionDescription":
                    inscriptionDescriptionList.add(inscriptionDescriptionParser.getInscriptionDescription(child));
                    break;
                default: break;
            }
        }

        return new Inscriptions(
                inscriptionTranscriptionList,
                inscriptionDescriptionList,
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
