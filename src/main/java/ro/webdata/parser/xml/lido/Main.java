package ro.webdata.parser.xml.lido;

import ro.webdata.parser.xml.lido.common.Constants;
import ro.webdata.parser.xml.lido.core.ParserDAO;
import ro.webdata.parser.xml.lido.core.ParserDAOImpl;
import ro.webdata.parser.xml.lido.core.leaf.descriptiveMetadata.DescriptiveMetadata;
import ro.webdata.parser.xml.lido.core.leaf.eventDate.EventDate;
import ro.webdata.parser.xml.lido.core.set.eventSet.EventSet;
import ro.webdata.parser.xml.lido.core.wrap.lidoWrap.LidoWrap;

import java.util.List;

public class Main {
//	http://www.lido-schema.org/schema/v1.0/lido-v1.0-schema-listing.html#conceptComplexType
//	Example: http://www.lido-schema.org/documents/examples/LIDO-Example_FMobj20344012-Fontana_del_Moro.xml
	//TODO: GENERAL: add getNodeName() and getNodeValue() methods
    //TODO: app.java.model.leaf.gml
    //TODO: PrintMessages for all required objects

	public static void main(String[] args) {
		String[] filePaths = {
				Constants.FILE_NAME_ARHEOLOGIE,
				Constants.FILE_NAME_ARTA,
				Constants.FILE_NAME_ARTE_DECO,
				Constants.FILE_NAME_DOC,
				Constants.FILE_NAME_ETNO,
				Constants.FILE_NAME_ST_TEH,
				Constants.FILE_NAME_ISTORIE,
				Constants.FILE_NAME_MEDALISTICA,
				Constants.FILE_NAME_NUMISMATICA,
				Constants.FILE_NAME_ST_NAT
		};

		System.out.println("total: " + getSize(filePaths));
	}

	private static int getSize(String[] filePaths) {
		int total = 0;

		for (int i = 0; i < filePaths.length; i++) {
			total = total + getSize(filePaths[i]);
		}

		return total;
	}

	private static int getSize(String filePath) {
		String xmlFilePath = Constants.FILE_FULL_PATH + Constants.FILE_SEPARATOR + filePath;
		ParserDAO parserDAO = new ParserDAOImpl();
		LidoWrap lidoWrap = parserDAO.parseLidoFile(xmlFilePath);

		DescriptiveMetadata descriptiveMetadata = lidoWrap.getLidoList().get(0).getDescriptiveMetadata().get(0);
		List<EventSet> eventSets = descriptiveMetadata.getEventWrap().getEventSet();

		for (int i = 0; i < eventSets.size(); i++) {
			EventDate eventDate = eventSets.get(i).getEvent().getEventDate();

			if (eventDate != null) {
				eventDate.getDisplayDate();
			}
//			System.out.println(eventDate == null);
		}

		return lidoWrap.getLidoList().size();
	}
}
