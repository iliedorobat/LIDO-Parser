package ro.webdata.parser.xml.lido.core.leaf.relatedWork;

import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RelatedWorkDAOImpl implements RelatedWorkDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();

    public RelatedWork getRelatedWork(Node node) {
        return new RelatedWork(objectSetComplexTypeDAO.getObjectSetComplexType(node));
    }
}
