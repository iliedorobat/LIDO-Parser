package ro.webdata.parser.xml.lido.core.wrap.lidoWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.attribute.LidoRelatedEncoding;
import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.leaf.lido.Lido;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Holds one or multiple object records.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>lido (1-unbounded)</b>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>relatedEncodingAttr (lido:relatedencoding)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoWrap {
	private ArrayList<Lido> lidoList = new ArrayList<Lido>();
	private LidoRelatedEncoding relatedEncodingAttr;
	private PrintMessages printMessages = new PrintMessages();

	public LidoWrap() {}

	public LidoWrap(ArrayList<Lido> lido, LidoRelatedEncoding relatedEncodingAttr) {
		setLidoList(lido);
		setRelatedEncodingAttr(relatedEncodingAttr);

		if (lido == null || lido.isEmpty()) {
			printMessages.printEmptyArray(LidoWrap.class, "lido:lido");
		}
	}

	public ArrayList<Lido> getLidoList() {
		return lidoList;
	}

	public void setLidoList(ArrayList<Lido> lidoList) {
		this.lidoList = lidoList;
	}

	public LidoRelatedEncoding getRelatedEncodingAttr() {
		return relatedEncodingAttr;
	}

	public void setRelatedEncodingAttr(LidoRelatedEncoding relatedEncodingAttr) {
		this.relatedEncodingAttr = relatedEncodingAttr;
	}
}
