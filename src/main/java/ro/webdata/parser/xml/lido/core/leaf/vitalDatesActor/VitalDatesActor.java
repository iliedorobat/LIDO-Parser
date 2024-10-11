package ro.webdata.parser.xml.lido.core.leaf.vitalDatesActor;

import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The lifespan of the person or the existence of the corporate
 * 			body or group..<br/>
 * 			<b>How to record:</b> For individuals, record birth date as earliest and death
 * 			date as latest date, estimated where necessary. For a corporate body or group,
 * 			record the dates of founding and dissolution.Although this is not a mandatory
 * 			field the use of birth date and death date is strongly recommended for unambigous
 * 			identification of individuals. The type attribute of earliest and latest date may
 * 			specify for indiviudals, if birth and death dates or if dates of activity are
 * 			recorded. Data values for type attribute may include: birthDate, deathDate,
 * 			estimatedDate.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class VitalDatesActor extends DateComplexType {
	public VitalDatesActor() {}

	public VitalDatesActor(DateComplexType dateComplexType) {
		super(
			dateComplexType.getEarliestDate(),
			dateComplexType.getLatestDate()
		);
	}
}
