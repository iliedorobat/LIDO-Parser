package ro.webdata.parser.xml.lido.core.wrap.repositoryWrap;

import ro.webdata.parser.xml.lido.core.set.repositorySet.RepositorySetDAO;
import ro.webdata.parser.xml.lido.core.set.repositorySet.RepositorySetDAOImpl;
import ro.webdata.parser.xml.lido.core.set.repositorySet.RepositorySet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RepositoryWrapDAOImpl implements RepositoryWrapDAO {
    private static RepositorySetDAO repositorySetParser = new RepositorySetDAOImpl();

    public RepositoryWrap getRepositoryWrap(Node node) {
        ArrayList<RepositorySet> repositorySetList = new ArrayList<RepositorySet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:repositorySet")) {
                repositorySetList.add(repositorySetParser.getRepositorySet(child));
            }
        }

        return new RepositoryWrap(repositorySetList);
    }
}
