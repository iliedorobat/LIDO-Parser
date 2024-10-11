package ro.webdata.parser.xml.lido.core.complex.dateSetComplexType;

import java.util.ArrayList;

import ro.webdata.parser.xml.lido.core.leaf.date.Date;
import ro.webdata.parser.xml.lido.core.leaf.displayDate.DisplayDate;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for date information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayDate (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for a date specification, corresponding to the following
 * 				date element.<br/>
 * 				<b>How to record:</b> It is a concise description of the date, presented in a syntax
 * 				suitable for display to the end-user and including any necessary indications of uncertainty,
 * 				ambiguity, and nuance.Repeat this element only for language variants.
 * 			</div>
 * 			<b>date (lido:dateComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Contains a date specification by providing a set of years as earliest and
 * 				latest date delimiting the respective span of time.This may be a period or a set of years in
 * 				the proleptic Gregorian calendar delimiting the span of time. If it is an exact date, possibly
 * 				with time, repeat the same date (and time) in earliest and latest date.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DateSetComplexType {
	private ArrayList<DisplayDate> displayDate;
	private Date date;

	public DateSetComplexType() {}

	public DateSetComplexType(ArrayList<DisplayDate> displayDate, Date date) {
		setDisplayDate(displayDate);
		setDate(date);
	}

	public ArrayList<DisplayDate> getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(ArrayList<DisplayDate> displayDate) {
		this.displayDate = displayDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
