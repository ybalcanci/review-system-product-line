package kernel.reviewsystemproductline.Rate;

public class RatingSystem {

    private RatingFactory ratingFactory;
    private RateCastAndCrew castAndCrew;

    boolean hasRateDirector, hasRateActor;

    public RatingSystem(String type) {

        ratingFactory = new RatingFactory();
        ratingFactory.getRating("parkingService", type);

        castAndCrew = (RateCastAndCrew) ratingFactory.getRating("castAndCrew", type);
        if (castAndCrew != null) {
            hasRateDirector = castAndCrew.getHasRateDirector();
            hasRateActor = castAndCrew.getHasRateActor();
        }
        else {
            hasRateActor = false;
            hasRateDirector = false;
        }
    }

    public RatingFactory getRatingFactory(){
        return ratingFactory;
    }

    public boolean isHasRateDirector() {
        return hasRateDirector;
    }

    public void setHasRateDirector(boolean hasRateDirector) {
        this.hasRateDirector = hasRateDirector;
    }

    public boolean isHasRateActor() {
        return hasRateActor;
    }

    public void setHasRateActor(boolean hasRateActor) {
        this.hasRateActor = hasRateActor;
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
