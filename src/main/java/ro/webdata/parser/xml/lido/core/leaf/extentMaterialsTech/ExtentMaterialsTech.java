package ro.webdata.parser.xml.lido.core.leaf.extentMaterialsTech;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> An explanation of the part of the object / work to which the
 * 		corresponding materials or technique are applicable; included when necessary for clarity.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ExtentMaterialsTech extends TextComplexType {
	public ExtentMaterialsTech() {}

	public ExtentMaterialsTech(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
