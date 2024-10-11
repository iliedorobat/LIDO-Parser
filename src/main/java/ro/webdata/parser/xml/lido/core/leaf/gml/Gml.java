package ro.webdata.parser.xml.lido.core.leaf.gml;

import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import ro.webdata.parser.xml.lido.core.complex.gmlComplexType.GmlComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Georeferences of the place using the GML specification.<br/>
 * 			<b>How to record:</b> Repeat this element only for language variants.<br/>
 * 			<b>Notes:</b> For further documentation on GML refer to http://www.opengis.net/gml/<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>lang (xml:lang)</b><br/>
 * 			</div>
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class Gml extends GmlComplexType {
	private XmlLang lang;

	public Gml() {}

	public Gml(GmlComplexType gmlComplexType, XmlLang lang) {
		super(
			gmlComplexType.getPoint(),
			gmlComplexType.getLineString(),
			gmlComplexType.getPolygon()
		);
		setLang(lang);
	}

	public XmlLang getLang() {
		return lang;
	}

	public void setLang(XmlLang lang) {
		this.lang = lang;
	}
}
