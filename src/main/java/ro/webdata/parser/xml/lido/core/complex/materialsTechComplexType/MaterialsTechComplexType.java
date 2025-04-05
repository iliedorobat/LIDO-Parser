package ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType;

import ro.webdata.parser.xml.lido.core.leaf.extentMaterialsTech.ExtentMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.sourceMaterialsTech.SourceMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.termMaterialsTech.TermMaterialsTech;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Materials and techniques for retrieval.<br/>
 * 		<b>How to record:</b> If multiple parts of the object / work require separate materials
 * 		and techniques, or if media and support are being recorded separately, repeat the materialsTechSet
 * 		element qualifying the extent sub-element.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>termMaterialsTech (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> A concept to index materials and/or technique.<br/>
 * 				<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 			</div>
 * 			<b>extentMaterialsTech (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> An explanation of the part of the object / work to which the corresponding
 * 				materials or technique are applicable; included when necessary for clarity.
 * 			</div>
 * 			<b>sourceMaterialsTech (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The source of the information about materials and technique, often used when
 * 				citing a published source of watermarks.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MaterialsTechComplexType {
	private List<TermMaterialsTech> termMaterialsTech;
	private List<ExtentMaterialsTech> extentMaterialsTech;
	private List<SourceMaterialsTech> sourceMaterialsTech;

	public MaterialsTechComplexType() {}

	public MaterialsTechComplexType(List<TermMaterialsTech> termMaterialsTech, List<ExtentMaterialsTech> extentMaterialsTech,
			List<SourceMaterialsTech> sourceMaterialsTech) {
		setExtentMaterialsTech(extentMaterialsTech);
		setSourceMaterialsTech(sourceMaterialsTech);
		setTermMaterialsTech(termMaterialsTech);
	}

	public List<TermMaterialsTech> getTermMaterialsTech() {
		return termMaterialsTech;
	}

	public void setTermMaterialsTech(List<TermMaterialsTech> termMaterialsTech) {
		this.termMaterialsTech = termMaterialsTech;
	}

	public List<ExtentMaterialsTech> getExtentMaterialsTech() {
		return extentMaterialsTech;
	}

	public void setExtentMaterialsTech(List<ExtentMaterialsTech> extentMaterialsTech) {
		this.extentMaterialsTech = extentMaterialsTech;
	}

	public List<SourceMaterialsTech> getSourceMaterialsTech() {
		return sourceMaterialsTech;
	}

	public void setSourceMaterialsTech(List<SourceMaterialsTech> sourceMaterialsTech) {
		this.sourceMaterialsTech = sourceMaterialsTech;
	}
}
