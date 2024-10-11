package ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteValue;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DescriptiveNoteValueDAOImpl implements DescriptiveNoteValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DescriptiveNoteValue getDescriptiveNoteValue(Node node) {
        return new DescriptiveNoteValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
