package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Qualifies the type of the given place entity according to political structures.<br/>
 * 		<b>How to record:</b> Data values can include: city, county, country, civil parish.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoPoliticalEntity {
	private String politicalEntity;

	public LidoPoliticalEntity() {}

	public LidoPoliticalEntity(String politicalEntity) {
		setPoliticalEntity(politicalEntity);
	}

	public String getPoliticalEntity() {
		return politicalEntity;
	}

	public void setPoliticalEntity(String politicalEntity) {
		this.politicalEntity = politicalEntity;
	}

	public String getAttrValue() {
		return politicalEntity;
	}

	public String getAttrName() {
		return "lido:politicalEntity";
	}
}
