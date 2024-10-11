package ro.webdata.parser.xml.lido.core.complex.appellationComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.appellationValue.AppellationValue;
import ro.webdata.parser.xml.lido.core.leaf.sourceAppellation.SourceAppellation;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for a name of an entity, and its related information.<br/>
 * 		<b>How to record:</b> If there is more than one name, repeat the appellation element.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>appellationValue (1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Appellations, e.g. titles, identifying phrases, or names given to an item,
 * 				but also name of a person or corporation, also place name etc.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>sourceAppellation (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The source for the appellation, generally a published source.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class AppellationComplexType {
	private ArrayList<AppellationValue> appellationValue;
	private ArrayList<SourceAppellation> sourceAppellation;
	private PrintMessages printMessages = new PrintMessages();

	public AppellationComplexType() {}

	public AppellationComplexType(ArrayList<AppellationValue> appellationValue, ArrayList<SourceAppellation> sourceAppellation) {
		setAppellationValue(appellationValue);
		setSourceAppellation(sourceAppellation);

		if (appellationValue == null || appellationValue.isEmpty()) {
			printMessages.printEmptyArray(AppellationComplexType.class, "lido:appellationValue");
		}
	}

	public ArrayList<AppellationValue> getAppellationValue() {
		return appellationValue;
	}

	public void setAppellationValue(ArrayList<AppellationValue> appellationValue) {
		this.appellationValue = appellationValue;
	}

	public ArrayList<SourceAppellation> getSourceAppellation() {
		return sourceAppellation;
	}

	public void setSourceAppellation(ArrayList<SourceAppellation> sourceAppellation) {
		this.sourceAppellation = sourceAppellation;
	}
}
