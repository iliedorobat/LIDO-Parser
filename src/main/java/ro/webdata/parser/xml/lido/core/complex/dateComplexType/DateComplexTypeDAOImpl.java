package ro.webdata.parser.xml.lido.core.complex.dateComplexType;

import ro.webdata.parser.xml.lido.core.leaf.earliestDate.EarliestDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.latestDate.LatestDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.earliestDate.EarliestDateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.latestDate.LatestDateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.earliestDate.EarliestDate;
import ro.webdata.parser.xml.lido.core.leaf.latestDate.LatestDate;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DateComplexTypeDAOImpl implements DateComplexTypeDAO {
    private static EarliestDateDAO earliestDateParser = new EarliestDateDAOImpl();
    private static LatestDateDAO latestDateDAO = new LatestDateDAOImpl();

    public DateComplexType getDateComplexType(Node node) {
        EarliestDate earliestDate = null;
        LatestDate latestDate = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:earliestDate":
                    earliestDate = earliestDateParser.getEarliestDate(child);
                    break;
                case "lido:latestDate":
                    latestDate = latestDateDAO.getLatestDate(child);
                    break;
                default: break;
            }
        }

        return new DateComplexType(earliestDate, latestDate);
    }
}
