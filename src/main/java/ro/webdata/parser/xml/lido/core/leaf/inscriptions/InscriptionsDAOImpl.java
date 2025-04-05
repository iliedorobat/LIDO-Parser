package ro.webdata.parser.xml.lido.core.leaf.inscriptions;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescription;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescriptionDAO;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionDescription.InscriptionDescriptionDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscription;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscriptionDAO;
import ro.webdata.parser.xml.lido.core.leaf.inscriptionTranscription.InscriptionTranscriptionDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InscriptionsDAOImpl implements InscriptionsDAO {
    private static InscriptionTranscriptionDAO inscriptionTranscriptionParser = new InscriptionTranscriptionDAOImpl();
    private static InscriptionDescriptionDAO inscriptionDescriptionParser = new InscriptionDescriptionDAOImpl();

    //TODO: create the InscriptionsComplexTypeDAO (artificial class) to extend the class
    public Inscriptions getInscriptions(Node node) {
        List<InscriptionTranscription> inscriptionTranscriptionList = new ArrayList<InscriptionTranscription>();
        List<InscriptionDescription> inscriptionDescriptionList = new ArrayList<InscriptionDescription>();
        Map<String, String> attributes = Graph.getAttributes(node);
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
