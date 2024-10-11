package ro.webdata.parser.xml.lido.core.leaf.culture;

import org.w3c.dom.Node;

public interface CultureDAO {
    /**
     *
     * @param node <b>lido:culture</b> node type.
     * @return <b>Culture</b>
     */
    Culture getCulture(Node node);
}
