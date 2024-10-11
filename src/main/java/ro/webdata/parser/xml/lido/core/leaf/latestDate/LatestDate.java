package ro.webdata.parser.xml.lido.core.leaf.latestDate;

import ro.webdata.parser.xml.lido.core.leaf.genericDate.GenericDate;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A year or exact date that broadly delimits the end of an implied
 * 			date span.<br/>
 * 			<b>How to record:</b> General format: YYYY[-MM[-DD]]Format is according to ISO 8601.
 * 			This may include date and time specification.
 * 		</div><br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b>
 * 			<div class="lido-attr-doc">
 * 				<b>Definition:</b> Specification of the date, e.g. if it is an exact
 * 				or an estimated earliest date.<br/>
 * 				<b>How to record:</b> Data values may be: exactDate, estimatedDate.
 * 			</div>
 * 			<b>source (lido:source)</b><br/>
 * 			<b>encodingAnalog (lido:encodinganalog)</b><br/>
 * 			<b>label (lido:label)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LatestDate extends GenericDate {
	public LatestDate() {}

	public LatestDate(GenericDate date) {
		super(
			date.getText(),
			date.getType(),
			date.getSource(),
			date.getEncodingAnalog(),
			date.getLabel()
		);
	}
}
