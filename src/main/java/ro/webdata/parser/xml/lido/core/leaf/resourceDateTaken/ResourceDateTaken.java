package ro.webdata.parser.xml.lido.core.leaf.resourceDateTaken;

import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A date or range of dates associated with the creation
 * 			or production of the original resource, e.g. the image or recording.<br/>
 * 			<b>Notes:</b> This is not necessarily the same as the date of production of
 * 			the digital resource (e.g. a digitization of a negative is usually made
 * 			years after the image was captured on film). Format will vary depending
 * 			upon implementation.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceDateTaken extends DateSetComplexType {
	public ResourceDateTaken() {}

	public ResourceDateTaken(DateSetComplexType dateSetComplexType) {
		super(
			dateSetComplexType.getDisplayDate(),
			dateSetComplexType.getDate()
		);
	}
}
