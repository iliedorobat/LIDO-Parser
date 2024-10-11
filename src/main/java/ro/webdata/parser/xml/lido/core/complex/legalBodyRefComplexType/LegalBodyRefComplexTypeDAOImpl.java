package ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType;

import ro.webdata.parser.xml.lido.core.leaf.legalBodyID.LegalBodyIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyName.LegalBodyNameDAO;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink.LegalBodyWeblinkDAO;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyID.LegalBodyIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyName.LegalBodyNameDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink.LegalBodyWeblinkDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyID.LegalBodyID;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyName.LegalBodyName;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink.LegalBodyWeblink;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class LegalBodyRefComplexTypeDAOImpl implements LegalBodyRefComplexTypeDAO {
    private static LegalBodyIDDAO legalBodyIDParser = new LegalBodyIDDAOImpl();
    private static LegalBodyNameDAO legalBodyNameParser = new LegalBodyNameDAOImpl();
    private static LegalBodyWeblinkDAO legalBodyWeblinkParser = new LegalBodyWeblinkDAOImpl();

    public LegalBodyRefComplexType getLegalBodyRefComplexType(Node node) {
        ArrayList<LegalBodyID> legalBodyIDList = new ArrayList<LegalBodyID>();
        ArrayList<LegalBodyName> legalBodyNameList = new ArrayList<LegalBodyName>();
        ArrayList<LegalBodyWeblink> legalBodyWeblinkList = new ArrayList<LegalBodyWeblink>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:legalBodyID":
                    legalBodyIDList.add(legalBodyIDParser.getLegalBodyID(child));
                    break;
                case "lido:legalBodyName":
                    legalBodyNameList.add(legalBodyNameParser.getLegalBodyName(child));
                    break;
                case "lido:legalBodyWeblink":
                    legalBodyWeblinkList.add(legalBodyWeblinkParser.getLegalBodyWeblink(child));
                    break;
                default: break;
            }
        }

        return new LegalBodyRefComplexType(
                legalBodyIDList, legalBodyNameList, legalBodyWeblinkList
        );
    }
}
