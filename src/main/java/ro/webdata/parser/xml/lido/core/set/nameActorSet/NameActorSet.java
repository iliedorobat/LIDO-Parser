package ro.webdata.parser.xml.lido.core.set.nameActorSet;

import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for name elements.<br/>
 * 		<b>How to record:</b> If there exists more than one name for a single actor,
 * 		repeat Name Actor Set.<br/>
 * 		<b>Notes:</b> Indicates names, appellations, or other identifiers assigned
 * 		to an individual, group of people, firm or other corporate body, or other entity.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class NameActorSet extends AppellationComplexType {
	public NameActorSet() {}

	public NameActorSet(AppellationComplexType appellationComplexType) {
		super(
			appellationComplexType.getAppellationValue(),
			appellationComplexType.getSourceAppellation()
		);
	}
}
