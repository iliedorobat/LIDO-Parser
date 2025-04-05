package ro.webdata.parser.xml.lido.core.complex.materialsTechSetComplexType;

import ro.webdata.parser.xml.lido.core.leaf.displayMaterialsTech.DisplayMaterialsTech;
import ro.webdata.parser.xml.lido.core.leaf.materialsTech.MaterialsTech;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for materials and technique information.<br/>
 * 		<b>Notes:</b> Indicates the substances or materials used, as well as any implements, production or
 * 		manufacturing techniques, processes, or methods incorporated.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>displayMaterialsTech (lido:textComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Display element for materials/technique, corresponding to the following
 * 				materialsTech element.<br/>
 * 				<b>How to record:</b> It is presented in a syntax suitable for display to the end-user and
 * 				including any necessary indications of uncertainty, ambiguity, and nuance.Repeat this element
 * 				only for language variants.
 * 			</div>
 * 			<b>materialsTech (lido:materialsTechComplexType 0-1)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Materials and techniques data used for indexing.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MaterialsTechSetComplexType {
	private List<DisplayMaterialsTech> displayMaterialsTech;
	private MaterialsTech materialsTech;

	public MaterialsTechSetComplexType() {}

	public MaterialsTechSetComplexType(List<DisplayMaterialsTech> displayMaterialsTech, MaterialsTech materialsTech) {
		setDisplayMaterialsTech(displayMaterialsTech);
		setMaterialsTech(materialsTech);
	}

	public List<DisplayMaterialsTech> getDisplayMaterialsTech() {
		return displayMaterialsTech;
	}

	public void setDisplayMaterialsTech(List<DisplayMaterialsTech> displayMaterialsTech) {
		this.displayMaterialsTech = displayMaterialsTech;
	}

	public MaterialsTech getMaterialsTech() {
		return materialsTech;
	}

	public void setMaterialsTech(MaterialsTech materialsTech) {
		this.materialsTech = materialsTech;
	}
}
