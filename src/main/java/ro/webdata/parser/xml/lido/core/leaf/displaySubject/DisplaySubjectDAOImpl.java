package ro.webdata.parser.xml.lido.core.leaf.displaySubject;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplaySubjectDAOImpl implements DisplaySubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplaySubject getDisplaySubject(Node node) {
        return new DisplaySubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
