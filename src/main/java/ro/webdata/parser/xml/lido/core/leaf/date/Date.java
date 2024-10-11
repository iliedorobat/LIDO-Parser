package ro.webdata.parser.xml.lido.core.leaf.date;

import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Contains a date specification by providing a set of years as earliest
 * 			and latest date delimiting the respective span of time.This may be a period or a set of
 * 			years in the proleptic Gregorian calendar delimiting the span of time. If it is an exact
 * 			date, possibly with time, repeat the same date (and time) in earliest and latest date.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Date extends DateComplexType {
	public Date() {}

	public Date(DateComplexType dateComplexType) {
		super(
			dateComplexType.getEarliestDate(),
			dateComplexType.getLatestDate()
		);
	}
}
