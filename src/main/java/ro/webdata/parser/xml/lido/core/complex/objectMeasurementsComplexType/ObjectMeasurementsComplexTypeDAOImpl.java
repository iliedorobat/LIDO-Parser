package ro.webdata.parser.xml.lido.core.complex.objectMeasurementsComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.lido.core.set.measurementsSet.MeasurementsSetDAO;
import ro.webdata.parser.xml.lido.core.set.measurementsSet.MeasurementsSetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.measurementsSet.MeasurementsSet;
import ro.webdata.parser.xml.lido.core.leaf.extentMeasurements.ExtentMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.extentMeasurements.ExtentMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.extentMeasurements.ExtentMeasurementsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.formatMeasurements.FormatMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.formatMeasurements.FormatMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.formatMeasurements.FormatMeasurementsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.qualifierMeasurements.QualifierMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.qualifierMeasurements.QualifierMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.qualifierMeasurements.QualifierMeasurementsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.scaleMeasurements.ScaleMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.scaleMeasurements.ScaleMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.scaleMeasurements.ScaleMeasurementsDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.shapeMeasurements.ShapeMeasurements;
import ro.webdata.parser.xml.lido.core.leaf.shapeMeasurements.ShapeMeasurementsDAO;
import ro.webdata.parser.xml.lido.core.leaf.shapeMeasurements.ShapeMeasurementsDAOImpl;

import java.util.ArrayList;

public class ObjectMeasurementsComplexTypeDAOImpl implements ObjectMeasurementsComplexTypeDAO {
    private static MeasurementsSetDAO measurementsSetParser = new MeasurementsSetDAOImpl();
    private static ExtentMeasurementsDAO extentMeasurementsParser = new ExtentMeasurementsDAOImpl();
    private static QualifierMeasurementsDAO qualifierMeasurementsParser = new QualifierMeasurementsDAOImpl();
    private static FormatMeasurementsDAO formatMeasurementsParser = new FormatMeasurementsDAOImpl();
    private static ShapeMeasurementsDAO shapeMeasurementsParser = new ShapeMeasurementsDAOImpl();
    private static ScaleMeasurementsDAO scaleMeasurementsParser = new ScaleMeasurementsDAOImpl();

    public ObjectMeasurementsComplexType getObjectMeasurementsComplexType(Node node) {
        ArrayList<MeasurementsSet> measurementsSetList = new ArrayList<MeasurementsSet>();
        ArrayList<ExtentMeasurements> extentMeasurementsList = new ArrayList<ExtentMeasurements>();
        ArrayList<QualifierMeasurements> qualifierMeasurementsList = new ArrayList<QualifierMeasurements>();
        ArrayList<FormatMeasurements> formatMeasurementsList = new ArrayList<FormatMeasurements>();
        ArrayList<ShapeMeasurements> shapeMeasurementsList = new ArrayList<ShapeMeasurements>();
        ArrayList<ScaleMeasurements> scaleMeasurementsList = new ArrayList<ScaleMeasurements>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:measurementsSet":
                    measurementsSetList.add(measurementsSetParser.getMeasurementsSet(child));
                    break;
                case "lido:extentMeasurements":
                    extentMeasurementsList.add(extentMeasurementsParser.getExtentMeasurements(child));
                    break;
                case "lido:qualifierMeasurements":
                    qualifierMeasurementsList.add(qualifierMeasurementsParser.getQualifierMeasurements(child));
                    break;
                case "lido:formatMeasurements":
                    formatMeasurementsList.add(formatMeasurementsParser.getFormatMeasurements(child));
                    break;
                case "lido:shapeMeasurements":
                    shapeMeasurementsList.add(shapeMeasurementsParser.getShapeMeasurements(child));
                    break;
                case "lido:scaleMeasurements":
                    scaleMeasurementsList.add(scaleMeasurementsParser.getScaleMeasurements(child));
                    break;
                default: break;
            }
        }

        return new ObjectMeasurementsComplexType(
                measurementsSetList,
                extentMeasurementsList,
                qualifierMeasurementsList,
                formatMeasurementsList,
                shapeMeasurementsList,
                scaleMeasurementsList
        );
    }
}
