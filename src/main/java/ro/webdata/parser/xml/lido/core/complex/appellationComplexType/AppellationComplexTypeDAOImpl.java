package ro.webdata.parser.xml.lido.core.complex.appellationComplexType;

import ro.webdata.parser.xml.lido.core.leaf.appellationValue.AppellationValueDAO;
import ro.webdata.parser.xml.lido.core.leaf.sourceAppellation.SourceAppellationDAO;
import ro.webdata.parser.xml.lido.core.leaf.appellationValue.AppellationValueDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.sourceAppellation.SourceAppellationDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.appellationValue.AppellationValue;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.sourceAppellation.SourceAppellation;

import java.util.ArrayList;

public class AppellationComplexTypeDAOImpl implements AppellationComplexTypeDAO {
    private static AppellationValueDAO appellValueParser = new AppellationValueDAOImpl();
    private static SourceAppellationDAO sourceAppellParser = new SourceAppellationDAOImpl();

    public AppellationComplexType getAppellationComplexType(Node node) {
        ArrayList<AppellationValue> appellationValueList = new ArrayList<AppellationValue>();
        ArrayList<SourceAppellation> sourceAppellationList = new ArrayList<SourceAppellation>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:appellationValue":
                    appellationValueList.add(appellValueParser.getAppellationValue(child));
                    break;
                case "lido:sourceAppellation":
                    sourceAppellationList.add(sourceAppellParser.getSourceAppellation(child));
                    break;
                default: break;
            }
        }

        return new AppellationComplexType(appellationValueList, sourceAppellationList);
    }
}
