package ro.webdata.parser.xml.lido.core.complex.conceptComplexType;

import ro.webdata.parser.xml.lido.core.leaf.conceptID.ConceptIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.term.TermDAO;
import ro.webdata.parser.xml.lido.core.leaf.conceptID.ConceptIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.term.TermDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.conceptID.ConceptID;
import ro.webdata.parser.xml.lido.core.leaf.term.Term;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ConceptComplexTypeDAOImpl implements ConceptComplexTypeDAO {
    private static ConceptIDDAO conceptIDParser = new ConceptIDDAOImpl();
    private static TermDAO termParser = new TermDAOImpl();

    public ConceptComplexType getConceptComplexType(Node node) {
        ArrayList<ConceptID> conceptIDList = new ArrayList<ConceptID>();
        ArrayList<Term> termList = new ArrayList<Term>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:conceptID":
                    conceptIDList.add(conceptIDParser.getConceptID(child));
                    break;
                case "lido:term":
                    termList.add(termParser.getTerm(child));
                    break;
                default: break;
            }
        }

        return new ConceptComplexType(conceptIDList, termList);
    }
}
