package ro.webdata.parser.xml.lido.core.complex.dateSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.date.Date;
import ro.webdata.parser.xml.lido.core.leaf.date.DateDAO;
import ro.webdata.parser.xml.lido.core.leaf.date.DateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.displayDate.DisplayDate;
import ro.webdata.parser.xml.lido.core.leaf.displayDate.DisplayDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.displayDate.DisplayDateDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class DateSetComplexTypeDAOImpl implements DateSetComplexTypeDAO {
    private static DisplayDateDAO displayDateParser = new DisplayDateDAOImpl();
    private static DateDAO dateParser = new DateDAOImpl();

    public DateSetComplexType getDateSetComplexTypeParser(Node node) {
        List<DisplayDate> displayDateList = new ArrayList<DisplayDate>();
        Date date = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayDate":
                    //TODO (for all arrays): add the item in the array only if it's NOT NULL
                    // in the "inp-clasate-arheologie-2014-02-02.xml" the last DisplayDate is null
                    // and because of this is thrown an error
                    // System.out.println(displayDateParser.getDisplayDate(child) == null);
                    displayDateList.add(displayDateParser.getDisplayDate(child));
                    break;
                case "lido:date":
                    date = dateParser.getDate(child);
                    break;
                default: break;
            }
        }

        return new DateSetComplexType(displayDateList, date);
    }
}
