package ro.webdata.parser.xml.lido.core.leaf.rightsDate;

import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The date on which a right is or was current.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsDate extends DateComplexType {
	public RightsDate() {}

	public RightsDate(DateComplexType dateComplexType) {
		super(
			dateComplexType.getEarliestDate(),
			dateComplexType.getLatestDate()
		);
	}
}
