package ro.webdata.parser.xml.lido.core.wrap.recordWrap;

import ro.webdata.parser.xml.lido.core.leaf.recordID.RecordIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordRights.RecordRightsDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordSource.RecordSourceDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordType.RecordTypeDAO;
import ro.webdata.parser.xml.lido.core.set.recordInfoSet.RecordInfoSetDAO;
import ro.webdata.parser.xml.lido.core.leaf.recordID.RecordIDDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.recordRights.RecordRightsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.recordSource.RecordSourceDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.recordType.RecordTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.set.recordInfoSet.RecordInfoSetDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.recordID.RecordID;
import ro.webdata.parser.xml.lido.core.leaf.recordRights.RecordRights;
import ro.webdata.parser.xml.lido.core.leaf.recordSource.RecordSource;
import ro.webdata.parser.xml.lido.core.leaf.recordType.RecordType;
import ro.webdata.parser.xml.lido.core.set.recordInfoSet.RecordInfoSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RecordWrapDAOImpl implements RecordWrapDAO {
    private static RecordIDDAO recordIDParser = new RecordIDDAOImpl();
    private static RecordTypeDAO recordTypeParser = new RecordTypeDAOImpl();
    private static RecordSourceDAO recordSourceParser = new RecordSourceDAOImpl();
    private static RecordRightsDAO recordRightsParser = new RecordRightsDAOImpl();
    private static RecordInfoSetDAO recordInfoSetParser = new RecordInfoSetDAOImpl();

    public RecordWrap getRecordWrap(Node node) {
        ArrayList<RecordID> recordIDList = new ArrayList<RecordID>();
        RecordType recordType = null;
        ArrayList<RecordSource> recordSourceList = new ArrayList<RecordSource>();
        ArrayList<RecordRights> recordRightsList = new ArrayList<RecordRights>();
        ArrayList<RecordInfoSet> recordInfoSetList = new ArrayList<RecordInfoSet>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:recordID":
                    recordIDList.add(recordIDParser.getRecordID(child));
                    break;
                case "lido:recordType":
                    recordType = recordTypeParser.getRecordType(child);
                    break;
                case "lido:recordSource":
                    recordSourceList.add(recordSourceParser.getRecordSourceType(child));
                    break;
                case "lido:recordRights":
                    recordRightsList.add(recordRightsParser.getRecordRights(child));
                    break;
                case "lido:recordInfoSet":
                    recordInfoSetList.add(recordInfoSetParser.getRecordInfoSet(child));
                    break;
                default: break;
            }
        }

        return new RecordWrap(
                recordIDList, recordType, recordSourceList,
                recordRightsList, recordInfoSetList
        );
    }
}
