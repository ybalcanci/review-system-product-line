package kernel.reviewsystemproductline.Explore.Recommendation;

public class RecommendationSystem {

    private RecommendationFactory recommendationFactory;

    public RecommendationSystem() {

        recommendationFactory = new RecommendationFactory();
        recommendationFactory.getRecommendation("restaurant");

        System.out.println("recommendation system is created");
    }

    public RecommendationFactory getRecommendationFactory() {
        return recommendationFactory;
    }


}
