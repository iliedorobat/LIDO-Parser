package ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType;

import ro.webdata.parser.xml.lido.core.leaf.legalBodyID.LegalBodyID;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyName.LegalBodyName;
import ro.webdata.parser.xml.lido.core.leaf.legalBodyWeblink.LegalBodyWeblink;

import java.util.List;

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
	private List<LegalBodyID> legalBodyID;
	private List<LegalBodyName> legalBodyName;
	private List<LegalBodyWeblink> legalBodyWeblink;

	public LegalBodyRefComplexType() {}

	public LegalBodyRefComplexType(List<LegalBodyID> legalBodyID,
			List<LegalBodyName> legalBodyName, List<LegalBodyWeblink> legalBodyWeblink) {
		setLegalBodyID(legalBodyID);
		setLegalBodyName(legalBodyName);
		setLegalBodyWeblink(legalBodyWeblink);
	}

	public List<LegalBodyID> getLegalBodyID() {
		return legalBodyID;
	}

	public void setLegalBodyID(List<LegalBodyID> legalBodyID) {
		this.legalBodyID = legalBodyID;
	}

	public List<LegalBodyName> getLegalBodyName() {
		return legalBodyName;
	}

	public void setLegalBodyName(List<LegalBodyName> legalBodyName) {
		this.legalBodyName = legalBodyName;
	}

	public List<LegalBodyWeblink> getLegalBodyWeblink() {
		return legalBodyWeblink;
	}

	public void setLegalBodyWeblink(List<LegalBodyWeblink> legalBodyWeblink) {
		this.legalBodyWeblink = legalBodyWeblink;
	}
}
