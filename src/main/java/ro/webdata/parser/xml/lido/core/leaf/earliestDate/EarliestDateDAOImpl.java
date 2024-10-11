package ro.webdata.parser.xml.lido.core.leaf.earliestDate;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.leaf.genericDate.GenericDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.genericDate.GenericDateDAOImpl;

public class EarliestDateDAOImpl implements EarliestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public EarliestDate getEarliestDate(Node node) {
        return new EarliestDate(genericDateDAO.getGenericDate(node));
    }
}
