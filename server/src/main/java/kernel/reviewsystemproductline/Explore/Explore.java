package kernel.reviewsystemproductline.Explore;
import kernel.reviewsystemproductline.Explore.Search.HotelSearch;
import kernel.reviewsystemproductline.Explore.Search.MovieSearch;
import kernel.reviewsystemproductline.Explore.Search.RestaurantSearch;
import kernel.reviewsystemproductline.Explore.Search.SearchingSystem;
import kernel.reviewsystemproductline.Helpers.*;
import kernel.reviewsystemproductline.Explore.Recommendation.RecommendationSystem;
import kernel.reviewsystemproductline.Explore.Filter.FilteringSystem;

import java.io.FileNotFoundException;

public class Explore {
	private String type;
    private boolean hasRecommendationSystem;

    private RecommendationSystem recommendationSys;
	private SearchingSystem searchingSystem;
	private FilteringSystem filteringSystem;


	public Explore(String type) {
		this.type = type;

		switch (type) {
			case "hotel":
				searchingSystem = new HotelSearch();
				break;
			case "movie":
				searchingSystem = new MovieSearch();
				break;
			case "restaurant":
				searchingSystem = new RestaurantSearch();
				break;
		}

        System.out.println("explore system is created");

        // Create Search And Filter System
        // searchAndFilterSys = SearchAndFilterSystem;  // TODO

        // If specified, create Recommendation System
        try {
            hasRecommendationSystem = Boolean.parseBoolean(ReadFile.readFile("hasRecommendationSystem"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (hasRecommendationSystem) {
            recommendationSys = new RecommendationSystem();
        }
    }
    public boolean getHasRecommendation(){
        return hasRecommendationSystem;
    }

    public RecommendationSystem getRecommendationSys() {
        return recommendationSys;
    }


    @Override
    public String toString() {
        return "Explore{" +
                "hasRecommendationSystem=" + hasRecommendationSystem +
                ", recommendationSys=" + recommendationSys.getRecommendationFactory() +
                '}';
    }
}
