package ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.leaf.extentMaterialsTech.ExtentMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.extentMaterialsTech.ExtentMaterialsTechDAO;
import ro.webdata.parser.xml.lido.core.leaf.extentMaterialsTech.ExtentMaterialsTechDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.sourceMaterialsTech.SourceMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.sourceMaterialsTech.SourceMaterialsTechDAO;
import ro.webdata.parser.xml.lido.core.leaf.sourceMaterialsTech.SourceMaterialsTechDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.termMaterialsTech.TermMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.termMaterialsTech.TermMaterialsTechDAO;
import ro.webdata.parser.xml.lido.core.leaf.termMaterialsTech.TermMaterialsTechDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class MaterialsTechComplexTypeDAOImpl implements MaterialsTechComplexTypeDAO {
    private static TermMaterialsTechDAO termMaterialsTechParser = new TermMaterialsTechDAOImpl();
    private static ExtentMaterialsTechDAO extentMaterialsTechParser = new ExtentMaterialsTechDAOImpl();
    private static SourceMaterialsTechDAO sourceMaterialsTechParser = new SourceMaterialsTechDAOImpl();

    public MaterialsTechComplexType getMaterialsTechComplexType(Node node) {
        List<TermMaterialsTech> termMaterialsTechList = new ArrayList<TermMaterialsTech>();
        List<ExtentMaterialsTech> extentMaterialsTechList = new ArrayList<ExtentMaterialsTech>();
        List<SourceMaterialsTech> sourceMaterialsTechList = new ArrayList<SourceMaterialsTech>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:termMaterialsTech":
                    termMaterialsTechList.add(termMaterialsTechParser.getTermMaterialsTech(child));
                    break;
                case "lido:extentMaterialsTech":
                    extentMaterialsTechList.add(extentMaterialsTechParser.getExtentMaterialsTech(child));
                    break;
                case "lido:sourceMaterialsTech":
                    sourceMaterialsTechList.add(sourceMaterialsTechParser.getSourceMaterialsTech(child));
                    break;
                default: break;
            }
        }

        return new MaterialsTechComplexType(
                termMaterialsTechList,
                extentMaterialsTechList,
                sourceMaterialsTechList
        );
    }
}
