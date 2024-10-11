package ro.webdata.parser.xml.lido.core.complex.recordInfoSetComplexType;

import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoID.RecordInfoIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoLink.RecordInfoLinkDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordMetadataDate.RecordMetadataDateDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoID.RecordInfoIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoLink.RecordInfoLinkDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.recordMetadataDate.RecordMetadataDateDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoID.RecordInfoID;
import ro.webdata.parser.xml.lido.core.leaf.recordInfoLink.RecordInfoLink;
import ro.webdata.parser.xml.lido.core.leaf.recordMetadataDate.RecordMetadataDate;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class RecordInfoSetComplexTypeDAOImpl implements RecordInfoSetComplexTypeDAO {
    private static RecordInfoIDDAO recordInfoIDParser = new RecordInfoIDDAOImpl();
    private static RecordInfoLinkDAO recordInfoLinkParser = new RecordInfoLinkDAOImpl();
    private static RecordMetadataDateDAO metadataParser = new RecordMetadataDateDAOImpl();

    public RecordInfoSetComplexType getRecordInfoSetComplexType(Node node) {
        ArrayList<RecordInfoID> recordInfoIDList = new ArrayList<RecordInfoID>();
        ArrayList<RecordInfoLink> recordInfoLinkList = new ArrayList<RecordInfoLink>();
        ArrayList<RecordMetadataDate> recordMetadataDateList = new ArrayList<RecordMetadataDate>();
        HashMap<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:recordInfoID":
                    recordInfoIDList.add(recordInfoIDParser.getRecordInfoID(child));
                    break;
                case "lido:recordInfoLink":
                    recordInfoLinkList.add(recordInfoLinkParser.getRecordInfoLink(child));
                    break;
                case "lido:recordMetadataDate":
                    recordMetadataDateList.add(metadataParser.getRecordMetadataDate(child));
                    break;
                default: break;
            }
        }

        return new RecordInfoSetComplexType(
                recordInfoIDList,
                recordInfoLinkList,
                recordMetadataDateList,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
