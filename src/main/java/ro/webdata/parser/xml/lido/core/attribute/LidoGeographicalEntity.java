package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Definition:</b> Qualifies the type of the given place entity according to geographical 
 * 		structures.<br/>
 * 		<b>How to record:</b> Data values can include: natural environment, landscape.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoGeographicalEntity {
	private String geographicalEntity;

	public LidoGeographicalEntity() {}

	public LidoGeographicalEntity(String geographicalEntity) {
		setGeographicalEntity(geographicalEntity);
	}

	public String getGeographicalEntity() {
		return geographicalEntity;
	}

	public void setGeographicalEntity(String geographicalEntity) {
		this.geographicalEntity = geographicalEntity;
	}

	public String getAttrValue() {
		return geographicalEntity;
	}

	public String getAttrName() {
		return "lido:geographicalEntity";
	}
}
