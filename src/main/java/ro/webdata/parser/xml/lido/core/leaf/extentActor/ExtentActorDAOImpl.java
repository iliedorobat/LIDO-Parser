package ro.webdata.parser.xml.lido.core.leaf.extentActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ExtentActorDAOImpl implements ExtentActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentActor getExtentActor(Node node) {
        return new ExtentActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
