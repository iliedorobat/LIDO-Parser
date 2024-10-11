package ro.webdata.parser.xml.lido.core.wrap.displayStateEditionWrap;

import ro.webdata.parser.xml.lido.core.leaf.displayEdition.DisplayEditionDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayState.DisplayStateDAO;
import ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition.SourceStateEditionDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayEdition.DisplayEditionDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayState.DisplayStateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition.SourceStateEditionDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayEdition.DisplayEdition;
import ro.webdata.parser.xml.lido.core.leaf.displayState.DisplayState;
import ro.webdata.parser.xml.lido.core.leaf.sourceStateEdition.SourceStateEdition;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class DisplayStateEditionWrapDAOImpl implements DisplayStateEditionWrapDAO {
    private static DisplayStateDAO displayStateParser = new DisplayStateDAOImpl();
    private static DisplayEditionDAO displayEditionParser = new DisplayEditionDAOImpl();
    private static SourceStateEditionDAO sourceStateEditionParser = new SourceStateEditionDAOImpl();

    public DisplayStateEditionWrap getDisplayStateEditionWrap(Node node) {
        ArrayList<DisplayState> displayStateList = new ArrayList<DisplayState>();
        ArrayList<DisplayEdition> displayEditionList = new ArrayList<DisplayEdition>();
        ArrayList<SourceStateEdition> sourceStateEditionList = new ArrayList<SourceStateEdition>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayState":
                    displayStateList.add(displayStateParser.getDisplayState(child));
                    break;
                case "lido:displayEdition":
                    displayEditionList.add(displayEditionParser.getDisplayEdition(child));
                    break;
                case "lido:sourceStateEdition":
                    sourceStateEditionList.add(sourceStateEditionParser.getSourceStateEdition(child));
                    break;
                default: break;
            }
        }

        return new DisplayStateEditionWrap(
                displayStateList,
                displayEditionList,
                sourceStateEditionList
        );
    }
}
