package kernel.reviewsystemproductline.Explore.Search;

public class SearchingSystemDetails {
	private boolean hasSearchByLocation;
	private boolean hasSearchByCast;
	private boolean hasSearchByFood;

	public SearchingSystemDetails() {
	}

	public boolean isHasSearchByLocation() {
		return hasSearchByLocation;
	}

	public void setHasSearchByLocation(boolean hasSearchByLocation) {
		this.hasSearchByLocation = hasSearchByLocation;
	}

	public boolean isHasSearchByCast() {
		return hasSearchByCast;
	}

	public void setHasSearchByCast(boolean hasSearchByCast) {
		this.hasSearchByCast = hasSearchByCast;
	}

	public boolean isHasSearchByFood() {
		return hasSearchByFood;
	}

	public void setHasSearchByFood(boolean hasSearchByFood) {
		this.hasSearchByFood = hasSearchByFood;
	}

	@Override
	public String toString() {
		return "SearchingSystemDetails{" +
				"hasSearchByLocation=" + hasSearchByLocation +
				", hasSearchByCast=" + hasSearchByCast +
				", hasSearchByFood=" + hasSearchByFood +
				'}';
	}

}
