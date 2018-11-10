package app.java.parser.dao.impl.element.leaf.subject;

import app.java.common.Utils;
import app.java.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectObjectDAO;
import app.java.parser.dao.impl.complex.object.ObjectSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.subject.SubjectObject;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectObjectDAOImpl implements SubjectObjectDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectObject getSubjectObject(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectObject(
                objectSetComplexTypeDAO.getObjectSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}