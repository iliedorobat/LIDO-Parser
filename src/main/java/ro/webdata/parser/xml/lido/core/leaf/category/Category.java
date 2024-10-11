package ro.webdata.parser.xml.lido.core.leaf.category;

import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Indicates the category of which this item is an instance, preferably
 * 			referring to CIDOC-CRM concept definitions.<br/>
 * 			<b>How to record:</b> CIDOC-CRM concept definitions are given at http://www.cidoc-crm.org/crm-concepts/Data
 * 			values in the sub-element term may often be: Man-Made Object (with conceptID
 * 			"http://www.cidoc-crm.org/crm-concepts/E22"), Man-Made Feature (http://www.cidoc-crm.org/crm-concepts/E25),
 * 			Collection (http://www.cidoc-crm.org/crm-concepts/E78).
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class Category extends ConceptComplexType {
	public Category() {}

	public Category(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
