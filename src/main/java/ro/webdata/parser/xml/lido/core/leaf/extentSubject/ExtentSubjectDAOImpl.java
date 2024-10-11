package ro.webdata.parser.xml.lido.core.leaf.extentSubject;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ExtentSubjectDAOImpl implements ExtentSubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentSubject getExtentSubject(Node node) {
        return new ExtentSubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
