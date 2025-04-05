package ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap;

import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.leaf.objectWorkType.ObjectWorkType;

import java.util.List;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for Object/Work Types.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>objectWorkType (1-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The specific kind of object / work being described.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary. For a collection,
 * 				include repeating instances for identifying all of or the most important items in the collection.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectWorkTypeWrap {
	private List<ObjectWorkType> objectWorkType;
	private PrintMessages printMessages = new PrintMessages();

	public ObjectWorkTypeWrap() {}

	public ObjectWorkTypeWrap(List<ObjectWorkType> objectWorkType) {
		setObjectWorkType(objectWorkType);

		if (objectWorkType == null || objectWorkType.isEmpty()) {
			printMessages.printEmptyArray(ObjectWorkTypeWrap.class, "lido:objectWorkType");
		}
	}

	public List<ObjectWorkType> getObjectWorkType() {
		return objectWorkType;
	}

	public void setObjectWorkType(List<ObjectWorkType> objectWorkType) {
		this.objectWorkType = objectWorkType;
	}
}
