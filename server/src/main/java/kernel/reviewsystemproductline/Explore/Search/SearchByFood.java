package kernel.reviewsystemproductline.Explore.Search;

public class SearchByFood extends SearchingSystem {
	private SearchingSystem searchingSystem;

	public SearchByFood(SearchingSystem searchingSystem) {
		this.searchingSystem = searchingSystem;
	}

	@Override
	public SearchingSystemDetails search() {
		SearchingSystemDetails currentSearch = searchingSystem.search();
		currentSearch.setHasSearchByFood(true);
		return currentSearch;
	}
}
