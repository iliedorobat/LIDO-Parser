package ro.webdata.parser.xml.lido.core.leaf.resourceDateTaken;

import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ResourceDateTakenDAOImpl implements ResourceDateTakenDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public ResourceDateTaken getDateSetComplexType(Node node) {
        return new ResourceDateTaken(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
