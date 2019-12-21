package kernel.reviewsystemproductline.Explore.Recommendation;

import javax.validation.constraints.Null;

public class RecommendationFactory {
    boolean hasRestaurantRecommendation = false;
    boolean hasTouristicRecommendation = false;
    boolean hasThemeRecommendation = false;
    public Recommendation getRecommendation(String recType) {
        switch (recType) {
            case "restaurant":
                hasRestaurantRecommendation = true;
                return new RestaurantRecommendation();
            case "touristic":
                hasTouristicRecommendation = true;
                return new TouristicPlaceRecommendation();
            case "theme":
                hasThemeRecommendation = true;
                return new ThemeRecommendation();
        }
        return null;
    }

}
