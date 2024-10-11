package ro.webdata.parser.xml.lido.core.set.namePlaceSet;

import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The name of the geographic place.<br/>
 * 		<b>How to record:</b> If there are different names of the same place,
 * 		e.g. today's and historical names, repeat this element.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class NamePlaceSet extends AppellationComplexType {
	public NamePlaceSet() {}

	public NamePlaceSet(AppellationComplexType appellationComplexType) {
		super(
			appellationComplexType.getAppellationValue(),
			appellationComplexType.getSourceAppellation()
		);
	}
}
