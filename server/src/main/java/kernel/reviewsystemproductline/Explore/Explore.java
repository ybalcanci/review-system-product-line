package kernel.reviewsystemproductline.Explore;
import kernel.reviewsystemproductline.Helpers.*;
import kernel.reviewsystemproductline.Explore.Recommendation.RecommendationSystem;

import java.io.FileNotFoundException;

public class Explore {

    private boolean hasRecommendationSystem;
    private RecommendationSystem recommendationSys;
    // private SearchAndFilterSystem searchAndFilterSys;  // TODO


    public  Explore() {

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
}
