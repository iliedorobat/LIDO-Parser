package ro.webdata.parser.xml.lido.core.leaf.displayActor;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Display element for one actor, corresponding to the following
 * 			actor element.<br/>
 * 			<b>How to record:</b> May include name, brief biographical information of the named
 * 			actor, presented in a syntax suitable for display to the end-user. If there is no
 * 			known actor, make a reference to the presumed culture or nationality of the unknown
 * 			actor. May be concatenated from the respective Actor element. The name should be in
 * 			natural order, if possible, although inverted order is acceptable. Include nationality
 * 			and life dates. For unknown actors, use e.g.: "unknown," "unknown Chinese," "Chinese,"
 * 			or "unknown 15th century Chinese."Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayActor extends TextComplexType {
	public DisplayActor() {}

	public DisplayActor(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
