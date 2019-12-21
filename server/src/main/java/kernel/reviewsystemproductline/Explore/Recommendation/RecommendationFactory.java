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

    public Recommendation getRecommendation(String recType, String type) {
        switch (recType) {
            case "restaurant":
                if (type.equals("restaurant")) {
                    hasRestaurantRecommendation = true;
                    return new RestaurantRecommendation();
                }else{
                    System.out.println("Recommendation constraint is not satisfied");
                }
            case "touristic":
                if (type.equals("hotel")) {
                    hasTouristicRecommendation = true;
                    return new TouristicPlaceRecommendation();
                }else{
                    System.out.println("Recommendation constraint is not satisfied");
                }
            case "theme":
                if (type.equals("restaurant") || type.equals("movie")) {
                    hasThemeRecommendation = true;
                    return new ThemeRecommendation();
                }else{
                    System.out.println("Recommendation constraint is not satisfied");
                }
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
