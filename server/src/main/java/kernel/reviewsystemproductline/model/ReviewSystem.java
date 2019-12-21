package kernel.reviewsystemproductline.model;

import kernel.reviewsystemproductline.Explore.Explore;
import kernel.reviewsystemproductline.Rate.RatingSystem;
import kernel.reviewsystemproductline.info.HotelInfo;
import kernel.reviewsystemproductline.info.InformationSystem;
import kernel.reviewsystemproductline.info.MovieInfo;
import kernel.reviewsystemproductline.info.RestaurantInfo;

public class ReviewSystem {
	private String type;
	private InformationSystem informationSystem;
	private Explore explore;
	private RatingSystem ratingsys;
	public ReviewSystem(String type) {
		this.type = type;
		ratingsys = new RatingSystem(type);
		switch (type){
			case "hotel":
				this.informationSystem = new HotelInfo();
				break;
			case "movie":
				this.informationSystem = new MovieInfo();
				break;
			case "rastaurant":
				this.informationSystem = new RestaurantInfo();
				break;
		}
		this.explore = new Explore(type);
	}
	public RatingSystem getRatingSystem(){
		return ratingsys;
	}
}
