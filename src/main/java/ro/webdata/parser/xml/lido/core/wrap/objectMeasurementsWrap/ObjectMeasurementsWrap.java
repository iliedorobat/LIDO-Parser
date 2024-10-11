package ro.webdata.parser.xml.lido.core.wrap.objectMeasurementsWrap;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.set.objectMeasurementsSet.ObjectMeasurementsSet;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for the Measurements.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>objectMeasurementsSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for display and index elements for object / work measurements.<br/>
 * 				<b>How to record:</b> If multiple parts of the object / work are measured repeat this element.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectMeasurementsWrap {
	private ArrayList<ObjectMeasurementsSet> objectMeasurementsSet;

	public ObjectMeasurementsWrap() {}

	public ObjectMeasurementsWrap(ArrayList<ObjectMeasurementsSet> objectMeasurementsSet) {
		setObjectMeasurementsSet(objectMeasurementsSet);
	}

	public ArrayList<ObjectMeasurementsSet> getObjectMeasurementsSet() {
		return objectMeasurementsSet;
	}

	public void setObjectMeasurementsSet(ArrayList<ObjectMeasurementsSet> objectMeasurementsSet) {
		this.objectMeasurementsSet = objectMeasurementsSet;
	}
}
