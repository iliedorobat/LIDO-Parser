package ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap;

import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.wrap.objectWorkTypeWrap.ObjectWorkTypeWrap;
import ro.webdata.parser.xml.lido.core.wrap.classificationWrap.ClassificationWrap;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for data classifying the object / work.Includes all
 * 		classifying information about an object / work, such as: object / work type, style,
 * 		genre, form, age, sex, and phase, or by how holding organization structures its
 * 		collection (e.g. fine art, decorative art, prints and drawings, natural science,
 * 		numismatics, or local history).<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>objectWorkTypeWrap (1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A wrapper for Object/Work Types.
 * 			</div>
 * 			<b>classificationWrap (0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A wrapper for any classification used to categorize an object /
 * 				work by grouping it together with others on the basis of similar characteristics.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectClassificationWrap {
	private ObjectWorkTypeWrap objectWorkTypeWrap;
	private ClassificationWrap classificationWrap;
	private PrintMessages printMessages = new PrintMessages();

	public ObjectClassificationWrap() {}

	public ObjectClassificationWrap(ObjectWorkTypeWrap objectWorkTypeWrap, ClassificationWrap classificationWrap) {
		setObjectWorkTypeWrap(objectWorkTypeWrap);
		setClassificationWrap(classificationWrap);

		if (objectWorkTypeWrap == null) {
			printMessages.printUndefinedNode(ObjectClassificationWrap.class, "lido:objectWorkTypeWrap");
		}
	}

	public ObjectWorkTypeWrap getObjectWorkTypeWrap() {
		return objectWorkTypeWrap;
	}

	public void setObjectWorkTypeWrap(ObjectWorkTypeWrap objectWorkTypeWrap) {
		this.objectWorkTypeWrap = objectWorkTypeWrap;
	}

	public ClassificationWrap getClassificationWrap() {
		return classificationWrap;
	}

	public void setClassificationWrap(ClassificationWrap classificationWrap) {
		this.classificationWrap = classificationWrap;
	}
}
