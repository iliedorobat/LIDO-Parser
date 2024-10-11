package ro.webdata.parser.xml.lido.core.leaf.displayActorInRole;

import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Display element for an actor coupled with its specific role,
 * 			corresponding to the following actor element.<br/>
 * 			<b>How to record:</b> May include name, brief biographical information, and roles
 * 			(if necessary) of the named actor, presented in a syntax suitable for display to
 * 			the end-user and including any necessary indications of uncertainty, ambiguity, and
 * 			nuance. If there is no known actor, make a reference to the presumed culture or
 * 			nationality of the unknown actor.May be concatenated from the respective Actor element.
 * 			The name should be in natural order, if possible, although inverted order is acceptable.
 * 			Include nationality and life dates. For unknown actors, use e.g.: "unknown," "unknown
 * 			Chinese," "Chinese," or "unknown 15th century Chinese."Repeat this element only for
 * 			language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayActorInRole extends TextComplexType {
	public DisplayActorInRole() {}

	public DisplayActorInRole(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
