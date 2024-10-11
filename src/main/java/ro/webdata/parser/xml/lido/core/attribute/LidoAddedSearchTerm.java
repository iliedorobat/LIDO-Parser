package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:string<br/>
 * 		<b>Java Type:</b> String<br/>
 * 		<b>Default value:</b> no<br/>
 * 		<b>How to record:</b> Has the two values: "yes" or "no". "yes" indicates,
 * 		that the term is an additional term which is derived from an underlying
 * 		controlled vocabulary (eg. synonym, generic term, superordinate term) and
 * 		should be used only for retrieval."no" is default.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoAddedSearchTerm {
	private String addedSearchTerm;

	public LidoAddedSearchTerm() {}

	public LidoAddedSearchTerm(String addedSearchTerm) {
		setAddedSearchTerm(addedSearchTerm);
	}

	public String getAddedSearchTerm() {
		return addedSearchTerm;
	}

	public void setAddedSearchTerm(String addedSearchTerm) {
		if (addedSearchTerm != null) {
			if (addedSearchTerm.equals("yes") || addedSearchTerm.equals("no")) {
				this.addedSearchTerm = addedSearchTerm;
			} else {
				this.addedSearchTerm = "no";
				System.err.println(LidoAddedSearchTerm.class.getName() + " error:\n"
						+ "\t* lido:addedSearchTerm attribute must be \"yes\" or \"no\";\n"
						+ "\t* the value of addedSearchTerm has been set to default value: \"no\".\n");
			}
		}
	}

	public String getAttrValue() {
		return addedSearchTerm;
	}

	public String getAttrName() {
		return "lido:addedSearchTerm";
	}
}
