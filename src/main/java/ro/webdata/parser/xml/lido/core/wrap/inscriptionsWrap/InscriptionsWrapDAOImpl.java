package ro.webdata.parser.xml.lido.core.wrap.inscriptionsWrap;

import ro.webdata.parser.xml.lido.core.leaf.inscriptions.InscriptionsDAO;
import ro.webdata.parser.xml.lido.core.leaf.inscriptions.InscriptionsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.inscriptions.Inscriptions;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class InscriptionsWrapDAOImpl implements InscriptionsWrapDAO {
    private static InscriptionsDAO inscriptionsDAO = new InscriptionsDAOImpl();

    public InscriptionsWrap getInscriptionsWrap(Node node) {
        ArrayList<Inscriptions> inscriptionsList = new ArrayList<Inscriptions>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:inscriptions")) {
                inscriptionsList.add(inscriptionsDAO.getInscriptions(child));
            }
        }

        return new InscriptionsWrap(inscriptionsList);
    }
}
