package kernel.reviewsystemproductline.Explore.Search;

public class SearchByCast extends SearchingSystem {
	private SearchingSystem searchingSystem;

	public SearchByCast(SearchingSystem searchingSystem) {
		this.searchingSystem = searchingSystem;
	}

	@Override
	public SearchingSystemDetails search() {
		SearchingSystemDetails currentSearch = searchingSystem.search();
		currentSearch.setHasSearchByCast(true);
		return currentSearch;
	}
}
