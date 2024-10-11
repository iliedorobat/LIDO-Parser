package ro.webdata.parser.xml.lido.core.complex.objectSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.displayObject.DisplayObject;
import ro.webdata.parser.xml.lido.core.leaf.object.Object;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and reference elements for an other object.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayObject: (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A free-text description of the object, corresponding to the following object element.<br/>
 * 				<b>How to record:</b> Repeat this element only for language variants.
 * 			</div>
 * 			<b>object: (lido:objectComplexType 0-1)</b><br/>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Contains identifying information and links to another object.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectSetComplexType {
	private ArrayList<DisplayObject> displayObject;
	private Object object;

	public ObjectSetComplexType() {}

	public ObjectSetComplexType(ArrayList<DisplayObject> displayObject, Object object) {
		setDisplayObject(displayObject);
		setObject(object);
	}

	public ArrayList<DisplayObject> getDisplayObject() {
		return displayObject;
	}

	public void setDisplayObject(ArrayList<DisplayObject> displayObject) {
		this.displayObject = displayObject;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
