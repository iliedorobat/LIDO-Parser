package ro.webdata.parser.xml.lido.core.wrap.titleWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.titleSet.TitleSet;
import ro.webdata.parser.xml.lido.core.set.titleSet.TitleSetDAO;
import ro.webdata.parser.xml.lido.core.set.titleSet.TitleSetDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class TitleWrapDAOImpl implements TitleWrapDAO {
    private static TitleSetDAO titleSetParser = new TitleSetDAOImpl();

    public TitleWrap getTitleWrap(Node node) {
        List<TitleSet> titleSetList = new ArrayList<TitleSet>();
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
