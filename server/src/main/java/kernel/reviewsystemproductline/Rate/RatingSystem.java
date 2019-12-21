package kernel.reviewsystemproductline.Rate;

public class RatingSystem {

    private RatingFactory ratingFactory;
    private RateCastAndCrew castAndCrew;

    boolean hasRateDirector, hasRateActor;

    public RatingSystem(String type) {

        ratingFactory = new RatingFactory();
        ratingFactory.getRating("parkingService", "restaurant");
        ratingFactory.getRating("deliveryTime", "restaurant");

        castAndCrew = (RateCastAndCrew) ratingFactory.getRating("castAndCrew", "movie");
        hasRateDirector = castAndCrew.getHasRateDirector();
        hasRateActor = castAndCrew.getHasRateActor();
    }

    public RatingFactory getRatingFactory(){
        return ratingFactory;
    }

    @Override
    public String toString() {
        return "RatingSystem{" + ratingFactory +
                ", hasRateDirector=" + hasRateDirector +
                ", hasRateActor=" + hasRateActor +
                '}';
    }

    public void rateOverall() {
        // TODO
    }

}
