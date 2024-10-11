package ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID.DescriptiveNoteIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteValue.DescriptiveNoteValueDAO;
import ro.webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote.SourceDescriptiveNoteDAO;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID.DescriptiveNoteIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteValue.DescriptiveNoteValueDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote.SourceDescriptiveNoteDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteID.DescriptiveNoteID;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveNoteValue.DescriptiveNoteValue;
import ro.webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote.SourceDescriptiveNote;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class DescriptiveNoteComplexTypeDAOImpl implements DescriptiveNoteComplexTypeDAO {
    private static DescriptiveNoteIDDAO descriptiveNoteIDParser = new DescriptiveNoteIDDAOImpl();
    private static DescriptiveNoteValueDAO descriptiveNoteValueParser = new DescriptiveNoteValueDAOImpl();
    private static SourceDescriptiveNoteDAO sourceDescriptiveNoteParser = new SourceDescriptiveNoteDAOImpl();

    public DescriptiveNoteComplexType getDescriptiveNoteComplexType(Node node) {
        ArrayList<DescriptiveNoteID> descriptiveNoteIDList = new ArrayList<DescriptiveNoteID>();
        ArrayList<DescriptiveNoteValue> descriptiveNoteValueList = new ArrayList<DescriptiveNoteValue>();
        ArrayList<SourceDescriptiveNote> sourceDescriptiveNoteList = new ArrayList<SourceDescriptiveNote>();
        HashMap<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:descriptiveNoteID":
                    descriptiveNoteIDList.add(descriptiveNoteIDParser.getDescriptiveNoteID(child));
                    break;
                case "lido:descriptiveNoteValue":
                    descriptiveNoteValueList.add(descriptiveNoteValueParser.getDescriptiveNoteValue(child));
                    break;
                case "lido:sourceDescriptiveNote":
                    sourceDescriptiveNoteList.add(sourceDescriptiveNoteParser.getSourceDescriptiveNote(child));
                    break;
                default: break;
            }
        }

        return new DescriptiveNoteComplexType(
                descriptiveNoteIDList,
                descriptiveNoteValueList,
                sourceDescriptiveNoteList,
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
