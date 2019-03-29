package ro.webdata.lido.parser.core.leaf.object;

import ro.webdata.lido.parser.core.complex.objectComplexType.ObjectComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Contains identifying information and links to another object.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Object extends ObjectComplexType {
	public Object() {}

	public Object(ObjectComplexType objectComplexType) {
		super(
			objectComplexType.getObjectWebResource(),
			objectComplexType.getObjectID(),
			objectComplexType.getObjectNote()
		);
	}
}