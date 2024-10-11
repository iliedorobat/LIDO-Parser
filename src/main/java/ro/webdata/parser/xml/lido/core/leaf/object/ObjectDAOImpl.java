package ro.webdata.parser.xml.lido.core.leaf.object;

import ro.webdata.parser.xml.lido.core.complex.objectComplexType.ObjectComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectComplexType.ObjectComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectDAOImpl implements ObjectDAO {
    private static ObjectComplexTypeDAO objectComplexTypeDAO = new ObjectComplexTypeDAOImpl();

    public Object getObject(Node node) {
        return new Object(objectComplexTypeDAO.getObjectComplexType(node));
    }
}
