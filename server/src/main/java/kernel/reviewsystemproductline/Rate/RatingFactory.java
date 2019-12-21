package kernel.reviewsystemproductline.Rate;

public class RatingFactory {

    boolean hasRateParkingService = false;
    boolean hasRateAndSeeHygiene = false;
    boolean hasRateAndSeeDeliveryTime = false;
    boolean hasRateWaiters = false;
    boolean hasRateCastAndCrew = false;

    public boolean isHasRateParkingService() {
        return hasRateParkingService;
    }

    public void setHasRateParkingService(boolean hasRateParkingService) {
        this.hasRateParkingService = hasRateParkingService;
    }

    public boolean isHasRateAndSeeHygiene() {
        return hasRateAndSeeHygiene;
    }

    public void setHasRateAndSeeHygiene(boolean hasRateAndSeeHygiene) {
        this.hasRateAndSeeHygiene = hasRateAndSeeHygiene;
    }

    public boolean isHasRateAndSeeDeliveryTime() {
        return hasRateAndSeeDeliveryTime;
    }

    public void setHasRateAndSeeDeliveryTime(boolean hasRateAndSeeDeliveryTime) {
        this.hasRateAndSeeDeliveryTime = hasRateAndSeeDeliveryTime;
    }

    public boolean isHasRateWaiters() {
        return hasRateWaiters;
    }

    public void setHasRateWaiters(boolean hasRateWaiters) {
        this.hasRateWaiters = hasRateWaiters;
    }

    public boolean isHasRateCastAndCrew() {
        return hasRateCastAndCrew;
    }

    public void setHasRateCastAndCrew(boolean hasRateCastAndCrew) {
        this.hasRateCastAndCrew = hasRateCastAndCrew;
    }

    public Rating getRating(String ratingType, String type) {
        switch (ratingType) {
            case "parkingService":
                if(type.equals("hotel") || type.equals("restaurant")){
                    hasRateParkingService = true;
                    return new RateParkingService();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
                break;
            case "hygiene":
                if(type.equals("hotel")){
                    hasRateAndSeeHygiene = true;
                    return new RateHygiene();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
                break;
            case "deliveryTime":
                if(type.equals("restaurant")){
                    hasRateAndSeeDeliveryTime = true;
                    return new RateDeliveryTime();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
                break;
            case "waiters":
                if(type.equals("restaurant")){
                    hasRateWaiters = true;
                    return new RateWaiters();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
                break;
            case "castAndCrew":
                if(type.equals("movie")){
                    hasRateCastAndCrew = true;
                    return new RateCastAndCrew();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
                break;
        }
        return null;
    }

    @Override
    public String toString() {
        return "RatingFactory{" +
                "hasRateParkingService=" + hasRateParkingService +
                ", hasRateAndSeeHygiene=" + hasRateAndSeeHygiene +
                ", hasRateAndSeeDeliveryTime=" + hasRateAndSeeDeliveryTime +
                ", hasRateWaiters=" + hasRateWaiters +
                ", hasRateCastAndCrew=" + hasRateCastAndCrew +
                '}';
    }

}
