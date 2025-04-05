package ro.webdata.parser.xml.lido.core.wrap.classificationWrap;

import ro.webdata.parser.xml.lido.core.leaf.classification.Classification;

import java.util.List;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A wrapper for classification information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>classification (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Concepts used to categorize an object / work by grouping it
 * 				together with others on the basis of similar characteristics.<br/>
 * 				<b>How to record:</b> The category belongs to a systematic scheme (classification)
 * 				which groups objects of similar characteristics according to uniform aspects. This
 * 				grouping / classification may be done according to material, form, shape, function,
 * 				region of origin, cultural context, or historical or stylistic period. In addition
 * 				to this systematic grouping it may also be done according to organizational divisions
 * 				within a museum (e.g., according to the collection structure of a museum). If the
 * 				object / work is assigned to multiple classifications, repeat this element. Preferably
 * 				taken from a published controlled vocabulary.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ClassificationWrap {
	private List<Classification> classification;

	public ClassificationWrap() {}

	public ClassificationWrap(List<Classification> classification) {
		setClassification(classification);
	}

	public List<Classification> getClassification() {
		return classification;
	}

	public void setClassification(List<Classification> classification) {
		this.classification = classification;
	}
}
