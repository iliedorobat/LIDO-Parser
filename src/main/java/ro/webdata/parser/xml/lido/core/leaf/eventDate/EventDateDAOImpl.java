package ro.webdata.parser.xml.lido.core.leaf.eventDate;

import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class EventDateDAOImpl implements EventDateDAO {
    private DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public EventDate getDisplayEvent(Node node) {
        return new EventDate(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
