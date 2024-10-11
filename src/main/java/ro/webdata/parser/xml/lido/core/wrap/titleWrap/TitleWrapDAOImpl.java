package ro.webdata.parser.xml.lido.core.wrap.titleWrap;

import ro.webdata.parser.xml.lido.core.set.titleSet.TitleSetDAO;
import ro.webdata.parser.xml.lido.core.set.titleSet.TitleSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.titleSet.TitleSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class TitleWrapDAOImpl implements TitleWrapDAO {
    private static TitleSetDAO titleSetParser = new TitleSetDAOImpl();

    public TitleWrap getTitleWrap(Node node) {
        ArrayList<TitleSet> titleSetList = new ArrayList<TitleSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:titleSet")) {
                titleSetList.add(titleSetParser.getTitleSet(child));
            }
        }

        return new TitleWrap(titleSetList);
    }
}
