package ro.webdata.parser.xml.lido.core.complex.rightsComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.creditLine.CreditLine;
import ro.webdata.parser.xml.lido.core.leaf.rightsDate.RightsDate;
import ro.webdata.parser.xml.lido.core.leaf.rightsHolder.RightsHolder;
import ro.webdata.parser.xml.lido.core.leaf.rightsType.RightsType;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Information about rights management; may include copyright
 * 		and other intellectual property statements.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>rightsType (lido:conceptComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The specific type of right being recorded.<br/>
 * 				<b>How to record:</b> For example: copyright, publication right,
 * 				data protection right, trademark.Preferably taken from a published
 * 				controlled value list.
 * 			</div>
 * 			<b>rightsDate (lido:dateComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The date on which a right is or was current.
 * 			</div>
 * 			<b>rightsHolder (0-unbounded)</b>
 *  		<div class="lido-elem-doc">
 * 				<b>Definition:</b> The holder of the right.
 * 			</div>
 * 			<b>creditLine (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Acknowledgement of the rights associated with the
 * 				physical and/or digital object as requested.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsComplexType {
	private ArrayList<RightsType> rightsType;
	private RightsDate rightsDate;
	private ArrayList<RightsHolder> rightsHolder;
	private ArrayList<CreditLine> creditLine;

	public RightsComplexType() {}

	public RightsComplexType(ArrayList<RightsType> rightsType, RightsDate rightsDate,
			ArrayList<RightsHolder> rightsHolder, ArrayList<CreditLine> creditLine) {
		setRightsType(rightsType);
		setRightsDate(rightsDate);
		setRightsHolder(rightsHolder);
		setCreditLine(creditLine);
	}

	public ArrayList<RightsType> getRightsType() {
		return rightsType;
	}

	public void setRightsType(ArrayList<RightsType> rightsType) {
		this.rightsType = rightsType;
	}

	public RightsDate getRightsDate() {
		return rightsDate;
	}

	public void setRightsDate(RightsDate rightsDate) {
		this.rightsDate = rightsDate;
	}

	public ArrayList<RightsHolder> getRightsHolder() {
		return rightsHolder;
	}

	public void setRightsHolder(ArrayList<RightsHolder> rightsHolder) {
		this.rightsHolder = rightsHolder;
	}

	public ArrayList<CreditLine> getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(ArrayList<CreditLine> creditLine) {
		this.creditLine = creditLine;
	}
}
