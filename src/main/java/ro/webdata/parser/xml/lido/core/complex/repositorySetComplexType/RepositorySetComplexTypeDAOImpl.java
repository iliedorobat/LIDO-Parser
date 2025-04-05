package ro.webdata.parser.xml.lido.core.complex.repositorySetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.leaf.repositoryLocation.RepositoryLocation;
import ro.webdata.parser.xml.lido.core.leaf.repositoryLocation.RepositoryLocationDAO;
import ro.webdata.parser.xml.lido.core.leaf.repositoryLocation.RepositoryLocationDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.repositoryName.RepositoryName;
import ro.webdata.parser.xml.lido.core.leaf.repositoryName.RepositoryNameDAO;
import ro.webdata.parser.xml.lido.core.leaf.repositoryName.RepositoryNameDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.workID.WorkID;
import ro.webdata.parser.xml.lido.core.leaf.workID.WorkIDDAO;
import ro.webdata.parser.xml.lido.core.leaf.workID.WorkIDDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RepositorySetComplexTypeDAOImpl implements RepositorySetComplexTypeDAO {
    private static RepositoryNameDAO repositoryNameParser = new RepositoryNameDAOImpl();
    private static WorkIDDAO workIDDAO = new WorkIDDAOImpl();
    private static RepositoryLocationDAO repositoryLocationParser = new RepositoryLocationDAOImpl();

    public RepositorySetComplexType getRepositorySetComplexType(Node node) {
        RepositoryName repositoryName = null;
        List<WorkID> workIDList = new ArrayList<WorkID>();
        RepositoryLocation repositoryLocation = null;
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:repositoryName":
                    repositoryName = repositoryNameParser.getRepositoryName(child);
                    break;
                case "lido:workID":
                    workIDList.add(workIDDAO.getWorkID(child));
                    break;
                case "lido:repositoryLocation":
                    repositoryLocation = repositoryLocationParser.getRepositoryLocation(child);
                    break;
                default: break;
            }
        }

        return new RepositorySetComplexType(
                repositoryName, workIDList, repositoryLocation,
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
