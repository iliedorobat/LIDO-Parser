package ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.legalBodyID.LegalBodyID;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyName.LegalBodyName;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink.LegalBodyWeblink;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Reference information to a legal body.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>legalBodyID (lido:identifierComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Unambiguous identification of the institution or person referred to as legal body.
 * 			</div>
 * 			<b>legalBodyName (lido:appellationComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Appellation of the institution or person.
 * 			</div>
 * 			<b>legalBodyWeblink (lido:webResourceComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Weblink of the institution or person referred to as legal body.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LegalBodyRefComplexType {
	private ArrayList<LegalBodyID> legalBodyID;
	private ArrayList<LegalBodyName> legalBodyName;
	private ArrayList<LegalBodyWeblink> legalBodyWeblink;

	public LegalBodyRefComplexType() {}

	public LegalBodyRefComplexType(ArrayList<LegalBodyID> legalBodyID,
			ArrayList<LegalBodyName> legalBodyName, ArrayList<LegalBodyWeblink> legalBodyWeblink) {
		setLegalBodyID(legalBodyID);
		setLegalBodyName(legalBodyName);
		setLegalBodyWeblink(legalBodyWeblink);
	}

	public ArrayList<LegalBodyID> getLegalBodyID() {
		return legalBodyID;
	}

	public void setLegalBodyID(ArrayList<LegalBodyID> legalBodyID) {
		this.legalBodyID = legalBodyID;
	}

	public ArrayList<LegalBodyName> getLegalBodyName() {
		return legalBodyName;
	}

	public void setLegalBodyName(ArrayList<LegalBodyName> legalBodyName) {
		this.legalBodyName = legalBodyName;
	}

	public ArrayList<LegalBodyWeblink> getLegalBodyWeblink() {
		return legalBodyWeblink;
	}

	public void setLegalBodyWeblink(ArrayList<LegalBodyWeblink> legalBodyWeblink) {
		this.legalBodyWeblink = legalBodyWeblink;
	}
}
