package ro.webdata.parser.xml.lido.core.leaf.extentSubject;

import org.w3c.dom.Node;

public interface ExtentSubjectDAO {
	/**
	 *
	 * @param node <b>lido:extentSubject</b> node type.
	 * @return <b>ExtentSubject</b>
	 */
	ExtentSubject getExtentSubject(Node node);
}
