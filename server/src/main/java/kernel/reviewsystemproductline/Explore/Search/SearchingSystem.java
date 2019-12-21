package kernel.reviewsystemproductline.Explore.Search;

public abstract class SearchingSystem {
	private SearchingSystemDetails searchingSystemDetails;

	public SearchingSystem() {
		this.searchingSystemDetails = new SearchingSystemDetails();
	}

	public SearchingSystemDetails search(){
		return searchingSystemDetails;
	}
}
