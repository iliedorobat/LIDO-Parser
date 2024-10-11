package ro.webdata.parser.xml.lido.core.set.repositorySet;

import ro.webdata.parser.xml.lido.core.complex.repositorySetComplexType.RepositorySetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for designation and identification of the institution
 * 		of custody, and possibly an indication of the exact location of the object<br/>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RepositorySet extends RepositorySetComplexType {
	public RepositorySet() {}

	public RepositorySet(RepositorySetComplexType repositorySetComplexType) {
		super(
			repositorySetComplexType.getRepositoryName(),
			repositorySetComplexType.getWorkID(),
			repositorySetComplexType.getRepositoryLocation(),
			repositorySetComplexType.getType(), repositorySetComplexType.getSortOrder()
		);
	}
}
