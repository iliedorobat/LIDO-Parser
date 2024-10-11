package ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType;

import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import ro.webdata.parser.xml.lido.core.wrap.recordWrap.RecordWrap;
import ro.webdata.parser.xml.lido.core.wrap.resourceWrap.ResourceWrap;
import ro.webdata.parser.xml.lido.core.wrap.rightsWorkWrap.RightsWorkWrap;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Holds the administrative metadata for an object / work record.<br/>
 * 		<b>How to record:</b> The attribute xml:lang is mandatory and specifies the language
 * 		of the administrative metadata.For fully multi-lingual resources, repeat this element
 * 		once for each language represented.If only a few data fields (e.g. title, creditline)
 * 		are provided in more than one language, the respective text elements may be repeated
 * 		specifying the lang attribute on the text level.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>rightsWorkWrap (0-1)</b><br/>
 * 			<b>recordWrap (1)</b><br/>
 * 			<b>resourceWrap (0-1)</b>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>lang (xml:lang) - REQUIRED</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class AdministrativeMetadataComplexType {
	private RightsWorkWrap rightsWorkWrap;
	private RecordWrap recordWrap;
	private ResourceWrap resourceWrap;
	private XmlLang lang;
	private PrintMessages printMessages = new PrintMessages();

	public AdministrativeMetadataComplexType() {}

	public AdministrativeMetadataComplexType(RightsWorkWrap rightsWorkWrap, RecordWrap recordWrap,
			ResourceWrap resourceWrap, XmlLang lang) {
		setRightsWorkWrap(rightsWorkWrap);
		setRecordWrap(recordWrap);
		setResourceWrap(resourceWrap);
		setLang(lang);

		if (recordWrap == null) {
			printMessages.printUndefinedNode(AdministrativeMetadataComplexType.class, "lido:recordWrap");
		}

		if (lang == null) {
			printMessages.printUndefinedAttribute(AdministrativeMetadataComplexType.class, "xml:lang");
		}
	}

	public RightsWorkWrap getRightsWorkWrap() {
		return rightsWorkWrap;
	}

	public void setRightsWorkWrap(RightsWorkWrap rightsWorkWrap) {
		this.rightsWorkWrap = rightsWorkWrap;
	}

	public RecordWrap getRecordWrap() {
		return recordWrap;
	}

	public void setRecordWrap(RecordWrap recordWrap) {
		this.recordWrap = recordWrap;
	}

	public ResourceWrap getResourceWrap() {
		return resourceWrap;
	}

	public void setResourceWrap(ResourceWrap resourceWrap) {
		this.resourceWrap = resourceWrap;
	}

	public XmlLang getLang() {
		return lang;
	}

	public void setLang(XmlLang lang) {
		this.lang = lang;
	}
}
