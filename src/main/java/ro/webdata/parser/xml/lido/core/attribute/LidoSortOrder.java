package ro.webdata.parser.xml.lido.core.attribute;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Lido Type:</b> xsd:integer<br/>
 * 		<b>Java Type:</b> int<br/>
 * 		<b>Definition:</b> Assigns a priority order for online presentation of the element.<br/>
 * 		<b>How to record:</b> Has to be a positive integer, with descending priority from 1 to x.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LidoSortOrder {
	private int sortOrder;

	public LidoSortOrder() {}

	public LidoSortOrder(int sortOrder) {
		setSortOrder(sortOrder);
	}

	public LidoSortOrder(String sortOrder) {
		setSortOrder(sortOrder);
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		if (sortOrder > 0) {
			this.sortOrder = sortOrder;
		} else {
			System.err.println(LidoSortOrder.class.getName() + " error:\n"
					+ "\t* the value of lido:sortorder attribute (" + sortOrder + ") must be a string "
					+ "that can be converted to a positive integer (1 to x).\n");
		}
	}

	public void setSortOrder(String sortOrder) {
		try {
			if (sortOrder != null)
				setSortOrder(Integer.parseInt(sortOrder));
		} catch (Exception e) {
			System.err.println(LidoSortOrder.class.getName() + " error:\n"
					+ "\t* the value of lido:sortorder attribute (" + sortOrder + ") must be a string "
					+ "that can be converted to a positive integer (1 to x).\n");
		}
	}

	public int getAttrValue() {
		return sortOrder;
	}

	public String getAttrName() {
		return "lido:sortorder";
	}
}
