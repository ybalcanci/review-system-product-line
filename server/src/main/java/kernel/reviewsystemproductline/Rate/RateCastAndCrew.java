package kernel.reviewsystemproductline.Rate;

import kernel.reviewsystemproductline.Explore.Recommendation.RecommendationSystem;
import kernel.reviewsystemproductline.Helpers.ReadFile;

import java.io.FileNotFoundException;

public class RateCastAndCrew implements Rating {

    public Boolean getHasRateDirector() {
        return hasRateDirector;
    }

    public Boolean getHasRateActor() {
        return hasRateActor;
    }

    public Boolean hasRateDirector = false;
    public Boolean hasRateActor = false;

    public RateCastAndCrew() {

        try {
            hasRateDirector = Boolean.parseBoolean(ReadFile.readFile("movie", "hasRateDirector"));
            hasRateActor = Boolean.parseBoolean(ReadFile.readFile("movie", "hasRateActor"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (hasRateDirector == false && hasRateActor == false) {
            System.out.println("invalid config file [OR constraint is not satisfied]");
        }
    }

    @Override
    public void rate(String a, int rating) {
        System.out.println("rating cast and crew");
    }
}
