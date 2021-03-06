package kernel.reviewsystemproductline.model;

import kernel.reviewsystemproductline.Explore.Explore;
import kernel.reviewsystemproductline.Rate.RatingSystem;
import kernel.reviewsystemproductline.info.*;
import kernel.reviewsystemproductline.Utility.UtilitySystem;

public class ReviewSystem {
	private ReviewSystemContext reviewSystemContext;
	private String type;
	private InformationSystem informationSystem;
	private Explore explore;
	private RatingSystem ratingSystem;
	private UtilitySystem utilitySystem;
	public ReviewSystem(String type) {

		this.type = type;
        System.out.println("REVIEW SYSTEM TYPE: " + this.type);
		ratingSystem = new RatingSystem(type);
        utilitySystem = new UtilitySystem(type);

		switch (type){
			case "hotel":
				this.informationSystem = new HotelInfo();
				//this.informationSystem = new Contact(new RoomPrice(new FAQ(new HotelInfo()))); //TODO DemoCase
				break;
			case "movie":
				this.informationSystem = new MovieInfo();
				//this.informationSystem = new Cast(new FAQ(new Trailer(new MovieInfo())));
				break;
			case "restaurant":
				//this.informationSystem = new RestaurantInfo();
				this.informationSystem = new Contact(new RestaurantInfo());
				break;
		}

		this.explore = new Explore(type);

		reviewSystemContext = new ReviewSystemContext(
		        explore.getFilteringSystem().isHasAgeLimit(),
				explore.getHasRecommendation(), ratingSystem.isHasRateActor(), ratingSystem.isHasRateDirector(),
				utilitySystem.isHasUploadImgFeature(),
				informationSystem.getInfo().isHasFAQ(),
				informationSystem.getInfo().isHasCast(),
				informationSystem.getInfo().isHasTrailer(),
				informationSystem.getInfo().isHasRoomPrice(),
				informationSystem.getInfo().isHasContact(),
				explore.getSearchingSystem().search().isHasSearchByLocation(),
				explore.getSearchingSystem().search().isHasSearchByCast(),
				explore.getSearchingSystem().search().isHasSearchByFood(),
				ratingSystem.getRatingFactory().isHasRateParkingService(),
				ratingSystem.getRatingFactory().isHasRateAndSeeHygiene(),
				ratingSystem.getRatingFactory().isHasRateAndSeeDeliveryTime(),
				ratingSystem.getRatingFactory().isHasRateWaiters(),
				ratingSystem.getRatingFactory().isHasRateCastAndCrew(),
				explore.getHasRecommendation() && explore.getRecommendationSys().getRecommendationFactory().isHasRestaurantRecommendation(),
				explore.getHasRecommendation() && explore.getRecommendationSys().getRecommendationFactory().isHasTouristicRecommendation(),
				explore.getHasRecommendation() && explore.getRecommendationSys().getRecommendationFactory().isHasThemeRecommendation(),
				type
		);
	}

	public ReviewSystemContext getReviewSystemContext() {
		return reviewSystemContext;
	}

	public RatingSystem getRatingSystem(){
		return ratingSystem;
	}
}
