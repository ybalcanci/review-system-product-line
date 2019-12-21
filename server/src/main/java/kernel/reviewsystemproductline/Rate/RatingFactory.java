package kernel.reviewsystemproductline.Rate;

public class RatingFactory {

    boolean hasRateParkingService = false;
    boolean hasRateAndSeeHygiene = false;
    boolean hasRateAndSeeDeliveryTime = false;
    boolean hasRateWaiters = false;
    boolean hasRateCastAndCrew = false;

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

    public Rating getRating(String ratingType, String type) {
        switch (ratingType) {
            case "parkingService":
                if(type.equals("hotel") || type.equals("restaurant")){
                    hasRateParkingService = true;
                    return new RateParkingService();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
            case "hygiene":
                if(type.equals("hotel")){
                    hasRateAndSeeHygiene = true;
                    return new RateHygiene();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
            case "deliveryTime":
                if(type.equals("restaurant")){
                    hasRateAndSeeDeliveryTime = true;
                    return new RateDeliveryTime();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
            case "waiters":
                if(type.equals("restaurant")){
                    hasRateWaiters = true;
                    return new RateWaiters();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
            case "castAndCrew":
                if(type.equals("movie")){
                    hasRateCastAndCrew = true;
                    return new RateCastAndCrew();
                }else{
                    System.out.println("Rating constraint is not satisfied");
                }
        }
        return null;
    }

}
