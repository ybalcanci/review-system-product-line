package kernel.reviewsystemproductline.model;

import kernel.reviewsystemproductline.Explore.Explore;
import kernel.reviewsystemproductline.Rate.RatingSystem;
import kernel.reviewsystemproductline.info.*;

public class ReviewSystem {
	private ReviewSystemContext reviewSystemContext;
	private String type;
	private InformationSystem informationSystem;
	private Explore explore;
	private RatingSystem ratingSystem;
	public ReviewSystem(String type) {

		this.type = type;
		ratingSystem = new RatingSystem(type);

		switch (type){
			case "hotel":
				this.informationSystem = new RoomPrice(new FAQ(new HotelInfo()));
				break;
			case "movie":
				this.informationSystem = new MovieInfo();
				break;
			case "rastaurant":
				this.informationSystem = new RestaurantInfo();
				break;
		}

		this.explore = new Explore(type);

		reviewSystemContext = new ReviewSystemContext(
				true,//hasagelimit
			explore.getHasRecommendation(), ratingSystem.isHasRateActor(), ratingSystem.isHasRateDirector(),
			true,//hasuploadimage
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
				explore.getHasRecommendation() && explore.getRecommendationSys().getRecommendationFactory().isHasThemeRecommendation()
		);
	}

	public ReviewSystemContext getReviewSystemContext() {
		return reviewSystemContext;
	}

	public RatingSystem getRatingSystem(){
		return ratingSystem;
	}
}
