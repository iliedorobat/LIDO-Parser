package ro.webdata.parser.xml.lido.core.wrap.repositoryWrap;

import ro.webdata.parser.xml.lido.core.set.repositorySet.RepositorySet;

import java.util.List;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for Repository/ Location information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>repositorySet (lido:repositorySetComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for designation and identification of the institution
 * 				of custody, and possibly an indication of the exact location of the object.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RepositoryWrap {
	private List<RepositorySet> repositorySet;

	public RepositoryWrap() {}

	public RepositoryWrap(List<RepositorySet> repositorySet) {
		setRepositorySet(repositorySet);
	}

	public List<RepositorySet> getRepositorySet() {
		return repositorySet;
	}

	public void setRepositorySet(List<RepositorySet> repositorySet) {
		this.repositorySet = repositorySet;
	}
}
