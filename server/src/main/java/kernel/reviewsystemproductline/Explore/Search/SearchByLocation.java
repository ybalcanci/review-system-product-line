package kernel.reviewsystemproductline.Explore.Search;

import kernel.reviewsystemproductline.info.InfoSystemDetails;

public class SearchByLocation extends SearchingSystem {
	private SearchingSystem searchingSystem;

	public SearchByLocation(SearchingSystem searchingSystem) {
		this.searchingSystem = searchingSystem;
	}

	@Override
	public SearchingSystemDetails search() {
		SearchingSystemDetails currentSearch = searchingSystem.search();
		currentSearch.setHasSearchByLocation(true);
		return currentSearch;
	}
}
