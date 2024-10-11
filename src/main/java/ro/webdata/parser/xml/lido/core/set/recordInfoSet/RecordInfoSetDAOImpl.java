package ro.webdata.parser.xml.lido.core.set.recordInfoSet;

import ro.webdata.parser.xml.lido.core.complex.recordInfoSetComplexType.RecordInfoSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.recordInfoSetComplexType.RecordInfoSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RecordInfoSetDAOImpl implements RecordInfoSetDAO {
    private static RecordInfoSetComplexTypeDAO recordInfoSetComplexTypeDAO = new RecordInfoSetComplexTypeDAOImpl();

    public RecordInfoSet getRecordInfoSet(Node node) {
        return new RecordInfoSet(recordInfoSetComplexTypeDAO.getRecordInfoSetComplexType(node));
    }
}
