package ro.webdata.parser.xml.lido.core.wrap.objectIdentificationWrap;

import org.w3c.dom.Node;

public interface ObjectIdentificationWrapDAO {
    /**
     *
     * @param node <b>lido:objectIdentificationWrap</b> node type.
     * @return <b>ObjectIdentificationWrap</b>
     */
    ObjectIdentificationWrap getObjectIdentificationWrap(Node node);
}
