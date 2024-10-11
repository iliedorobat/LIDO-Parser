package ro.webdata.parser.xml.lido.core.complex.dateComplexType;

import ro.webdata.parser.xml.lido.core.leaf.earliestDate.EarliestDate;
import ro.webdata.parser.xml.lido.core.leaf.latestDate.LatestDate;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for date specification.<br/>
 * 		<b>How to record:</b> This may be a period or a set of years in the
 * 		proleptic Gregorian calendar delimiting the span of time. If it is
 * 		an exact date, possibly with time, repeat the same date (and time)
 * 		in earliest and latest date. For ca. and other uncertain or approximate
 * 		dates, estimate the greatest possible span for indexing. Uncertainty
 * 		can be indicated in the type attributes of earliest and latest date,
 * 		and can be characterized more precisely in the display element.<br/>
 * 		<b>Notes:</b> Format of the data values in sub-elements earliestDate
 * 		and LatestDate is according to ISO 8601. This includes date and time
 * 		specification.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>earliestDate (0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A year or exact date that broadly delimits
 * 				the beginning of an implied date span.<br/>
 * 				<b>How to record:</b> General format: YYYY[-MM[-DD]]Format is
 * 				according to ISO 8601. This may include date and time specification.
 * 			</div>
 * 			<b>latestDate (0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A year or exact date that broadly delimits
 * 				the end of an implied date span.<br/>
 * 				<b>How to record:</b> General format: YYYY[-MM[-DD]]Format is
 * 				according to ISO 8601. This may include date and time specification.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DateComplexType {
	private EarliestDate earliestDate;
	private LatestDate latestDate;

	public DateComplexType() {}

	public DateComplexType(EarliestDate earliestDate, LatestDate latestDate) {
		setEarliestDate(earliestDate);
		setLatestDate(latestDate);
	}

	public EarliestDate getEarliestDate() {
		return earliestDate;
	}

	public void setEarliestDate(EarliestDate earliestDate) {
		this.earliestDate = earliestDate;
	}

	public LatestDate getLatestDate() {
		return latestDate;
	}

	public void setLatestDate(LatestDate latestDate) {
		this.latestDate = latestDate;
	}
}
