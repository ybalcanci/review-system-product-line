package kernel.reviewsystemproductline.Explore.Recommendation;

public class RecommendationSystem {

    private RecommendationFactory recommendationFactory;

    public RecommendationSystem(String type) {

        recommendationFactory = new RecommendationFactory();
        recommendationFactory.getRecommendation("touristic", type);

        //recommendationFactory.getRecommendation("touristic", type);

        System.out.println("recommendation system is created");
    }

    public RecommendationFactory getRecommendationFactory() {
        return recommendationFactory;
    }


}
