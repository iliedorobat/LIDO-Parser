package ro.webdata.parser.xml.lido.core.wrap.objectIdentificationWrap;

import ro.webdata.parser.xml.lido.common.PrintMessages;
import ro.webdata.parser.xml.lido.core.wrap.objectMeasurementsWrap.ObjectMeasurementsWrap;
import ro.webdata.parser.xml.lido.core.wrap.repositoryWrap.RepositoryWrap;
import ro.webdata.parser.xml.lido.core.wrap.titleWrap.TitleWrap;
import ro.webdata.parser.xml.lido.core.wrap.displayStateEditionWrap.DisplayStateEditionWrap;
import ro.webdata.parser.xml.lido.core.wrap.inscriptionsWrap.InscriptionsWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectClassificationWrap.ObjectClassificationWrap;
import ro.webdata.parser.xml.lido.core.wrap.objectDescriptionWrap.ObjectDescriptionWrap;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A Wrapper for information that identifies the object.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>titleWrap (1)</b><br/>
 * 			<b>inscriptionsWrap (0-1)</b><br/>
 * 			<b>repositoryWrap (0-1</b>)<br/>
 * 			<b>displayStateEditionWrap (0-1</b>)<br/>
 * 			<b>objectDescriptionWrap (0-1)</b><br/>
 * 			<b>objectMeasurementsWrap (0-1)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectIdentificationWrap {
	private TitleWrap titleWrap;
	private InscriptionsWrap inscriptionsWrap;
	private RepositoryWrap repositoryWrap;
	private DisplayStateEditionWrap displayStateEditionWrap;
	private ObjectDescriptionWrap objectDescriptionWrap;
	private ObjectMeasurementsWrap objectMeasurementsWrap;
	private PrintMessages printMessages = new PrintMessages();

	public ObjectIdentificationWrap() {}

	public ObjectIdentificationWrap(TitleWrap titleWrap, InscriptionsWrap inscriptionsWrap, RepositoryWrap repositoryWrap,
			DisplayStateEditionWrap displayStateEditionWrap, ObjectDescriptionWrap objectDescriptionWrap,
			ObjectMeasurementsWrap objectMeasurementsWrap) {
		setTitleWrap(titleWrap);
		setInscriptionsWrap(inscriptionsWrap);
		setRepositoryWrap(repositoryWrap);
		setDisplayStateEditionWrap(displayStateEditionWrap);
		setObjectDescriptionWrap(objectDescriptionWrap);
		setObjectMeasurementsWrap(objectMeasurementsWrap);

		if (titleWrap == null) {
			printMessages.printUndefinedNode(ObjectClassificationWrap.class, "lido:titleWrap");
		}
	}

	public TitleWrap getTitleWrap() {
		return titleWrap;
	}

	public void setTitleWrap(TitleWrap titleWrap) {
		this.titleWrap = titleWrap;
	}

	public InscriptionsWrap getInscriptionsWrap() {
		return inscriptionsWrap;
	}

	public void setInscriptionsWrap(InscriptionsWrap inscriptionsWrap) {
		this.inscriptionsWrap = inscriptionsWrap;
	}

	public RepositoryWrap getRepositoryWrap() {
		return repositoryWrap;
	}

	public void setRepositoryWrap(RepositoryWrap repositoryWrap) {
		this.repositoryWrap = repositoryWrap;
	}

	public DisplayStateEditionWrap getDisplayStateEditionWrap() {
		return displayStateEditionWrap;
	}

	public void setDisplayStateEditionWrap(DisplayStateEditionWrap displayStateEditionWrap) {
		this.displayStateEditionWrap = displayStateEditionWrap;
	}

	public ObjectDescriptionWrap getObjectDescriptionWrap() {
		return objectDescriptionWrap;
	}

	public void setObjectDescriptionWrap(ObjectDescriptionWrap objectDescriptionWrap) {
		this.objectDescriptionWrap = objectDescriptionWrap;
	}

	public ObjectMeasurementsWrap getObjectMeasurementsWrap() {
		return objectMeasurementsWrap;
	}

	public void setObjectMeasurementsWrap(ObjectMeasurementsWrap objectMeasurementsWrap) {
		this.objectMeasurementsWrap = objectMeasurementsWrap;
	}
}
