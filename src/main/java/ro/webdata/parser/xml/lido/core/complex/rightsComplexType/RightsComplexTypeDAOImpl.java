package ro.webdata.parser.xml.lido.core.complex.rightsComplexType;

import ro.webdata.parser.xml.lido.core.leaf.creditLine.CreditLineDAO;
import ro.webdata.parser.xml.lido.core.leaf.rightsDate.RightsDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.rightsHolder.RightsHolderDAO;
import ro.webdata.parser.xml.lido.core.leaf.rightsType.RightsTypeDAO;
import ro.webdata.parser.xml.lido.core.leaf.creditLine.CreditLineDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.rightsDate.RightsDateDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.rightsHolder.RightsHolderDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.rightsType.RightsTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.creditLine.CreditLine;
import ro.webdata.parser.xml.lido.core.leaf.rightsDate.RightsDate;
import ro.webdata.parser.xml.lido.core.leaf.rightsHolder.RightsHolder;
import ro.webdata.parser.xml.lido.core.leaf.rightsType.RightsType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RightsComplexTypeDAOImpl implements RightsComplexTypeDAO {
    private static RightsTypeDAO rightsTypeDAO = new RightsTypeDAOImpl();
    private static RightsDateDAO rightsDateParser = new RightsDateDAOImpl();
    private static RightsHolderDAO holderParser = new RightsHolderDAOImpl();
    private static CreditLineDAO creditLineParser = new CreditLineDAOImpl();

    public RightsComplexType getRightsComplexType(Node node) {
        ArrayList<RightsType> rightsTypeList = new ArrayList<RightsType>();
        RightsDate rightsDate = null;
        ArrayList<RightsHolder> rightsHolder = new ArrayList<RightsHolder>();
        ArrayList<CreditLine> creditLine = new ArrayList<CreditLine>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:rightsType":
                    rightsTypeList.add(rightsTypeDAO.getRightsType(child));
                    break;
                case "lido:rightsDate":
                    rightsDate = rightsDateParser.getRightsDate(child);
                    break;
                case "lido:rightsHolder":
                    rightsHolder.add(holderParser.getRightsHolder(child));
                    break;
                case "lido:creditLine":
                    creditLine.add(creditLineParser.getCreditLine(child));
                    break;
                default: break;
            }
        }

        return new RightsComplexType(
                rightsTypeList,
                rightsDate,
                rightsHolder,
                creditLine
        );
    }
}
