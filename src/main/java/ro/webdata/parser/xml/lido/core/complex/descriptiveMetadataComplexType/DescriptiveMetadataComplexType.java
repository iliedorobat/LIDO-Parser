package ro.webdata.parser.xml.lido.core.complex.descriptiveMetadataComplexType;

import ro.webdata.parser.xml.lido.core.attribute.XmlLang;
import ro.webdata.parser.xml.lido.core.wrap.eventWrap.EventWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap.ObjectClassificationWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectIdentificationWrap.ObjectIdentificationWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectRelationWrap.ObjectRelationWrap;
import ro.webdata.parser.xml.lido.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Holds the descriptive metadata of an object record.</br/>
 * 		<b>How to record:</b> The attribute xml:lang is mandatory and specifies the
 * 		language of the descriptive metadata.For fully multi-lingual resources, repeat
 * 		this element once for each language represented.If only a few data fields (e.g.
 * 		title) are provided in more than one language, the respective text elements may
 * 		be repeated specifying the lang attribute on the text level.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>objectClassificationWrap (1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for all classifying information about an object /
 * 				work including the object's / work type and other classifications.
 * 			</div>
 * 			<b>objectIdentificationWrap (1)</b><br/>
 * 			<b>eventWrap (0-1)</b><br/>
 * 			<b>objectRelationWrap (0-1)</b><br/>
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
public class DescriptiveMetadataComplexType {
	private ObjectClassificationWrap objectClassificationWrap;
	private ObjectIdentificationWrap objectIdentificationWrap;
	private EventWrap eventWrap;
	private ObjectRelationWrap objectRelationWrap;
	private XmlLang lang;
	private PrintMessages printMessages = new PrintMessages();

	public DescriptiveMetadataComplexType() {}

	public DescriptiveMetadataComplexType(ObjectClassificationWrap objectClassificationWrap,
			ObjectIdentificationWrap objectIdentificationWrap, EventWrap eventWrap,
			ObjectRelationWrap objectRelationWrap, XmlLang lang) {
		setEventWrap(eventWrap);
		setObjectClassificationWrap(objectClassificationWrap);
		setObjectIdentificationWrap(objectIdentificationWrap);
		setObjectRelationWrap(objectRelationWrap);
		setLang(lang);

		if (objectClassificationWrap == null) {
			printMessages.printUndefinedNode(DescriptiveMetadataComplexType.class, "lido:objectClassificationWrap");
		}

		if (objectIdentificationWrap == null) {
			printMessages.printUndefinedNode(DescriptiveMetadataComplexType.class, "lido:objectIdentificationWrap");
		}

		if (lang == null) {
			printMessages.printUndefinedAttribute(DescriptiveMetadataComplexType.class, "xml:lang");
		}
	}

	public ObjectClassificationWrap getObjectClassificationWrap() {
		return objectClassificationWrap;
	}

	public void setObjectClassificationWrap(ObjectClassificationWrap objectClassificationWrap) {
		this.objectClassificationWrap = objectClassificationWrap;
	}

	public ObjectIdentificationWrap getObjectIdentificationWrap() {
		return objectIdentificationWrap;
	}

	public void setObjectIdentificationWrap(ObjectIdentificationWrap objectIdentificationWrap) {
		this.objectIdentificationWrap = objectIdentificationWrap;
	}

	public EventWrap getEventWrap() {
		return eventWrap;
	}

	public void setEventWrap(EventWrap eventWrap) {
		this.eventWrap = eventWrap;
	}

	public ObjectRelationWrap getObjectRelationWrap() {
		return objectRelationWrap;
	}

	public void setObjectRelationWrap(ObjectRelationWrap objectRelationWrap) {
		this.objectRelationWrap = objectRelationWrap;
	}

	public XmlLang getLang() {
		return lang;
	}

	public void setLang(XmlLang lang) {
		this.lang = lang;
	}
}
