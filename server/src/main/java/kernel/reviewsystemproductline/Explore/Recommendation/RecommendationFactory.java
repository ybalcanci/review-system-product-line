package kernel.reviewsystemproductline.Explore.Recommendation;

import javax.validation.constraints.Null;

public class RecommendationFactory {
    boolean hasRestaurantRecommendation = false;
    boolean hasTouristicRecommendation = false;
    boolean hasThemeRecommendation = false;

    public boolean isHasRestaurantRecommendation() {
        return hasRestaurantRecommendation;
    }

    public void setHasRestaurantRecommendation(boolean hasRestaurantRecommendation) {
        this.hasRestaurantRecommendation = hasRestaurantRecommendation;
    }

    public boolean isHasTouristicRecommendation() {
        return hasTouristicRecommendation;
    }

    public void setHasTouristicRecommendation(boolean hasTouristicRecommendation) {
        this.hasTouristicRecommendation = hasTouristicRecommendation;
    }

    public boolean isHasThemeRecommendation() {
        return hasThemeRecommendation;
    }

    public void setHasThemeRecommendation(boolean hasThemeRecommendation) {
        this.hasThemeRecommendation = hasThemeRecommendation;
    }

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

    @Override
    public String toString() {
        return "RecommendationFactory{" +
                "hasRestaurantRecommendation=" + hasRestaurantRecommendation +
                ", hasTouristicRecommendation=" + hasTouristicRecommendation +
                ", hasThemeRecommendation=" + hasThemeRecommendation +
                '}';
    }

}
