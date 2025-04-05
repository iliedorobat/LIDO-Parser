package ro.webdata.parser.xml.lido.core.wrap.inscriptionsWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.inscriptions.Inscriptions;
import ro.webdata.parser.xml.lido.core.leaf.inscriptions.InscriptionsDAO;
import ro.webdata.parser.xml.lido.core.leaf.inscriptions.InscriptionsDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class InscriptionsWrapDAOImpl implements InscriptionsWrapDAO {
    private static InscriptionsDAO inscriptionsDAO = new InscriptionsDAOImpl();

    public InscriptionsWrap getInscriptionsWrap(Node node) {
        List<Inscriptions> inscriptionsList = new ArrayList<Inscriptions>();
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
