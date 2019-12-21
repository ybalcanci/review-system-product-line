package kernel.reviewsystemproductline;

import kernel.reviewsystemproductline.Explore.Search.RestaurantSearch;
import kernel.reviewsystemproductline.Explore.Search.SearchByFood;
import kernel.reviewsystemproductline.Explore.Search.SearchByLocation;
import kernel.reviewsystemproductline.Explore.Search.SearchingSystem;
import kernel.reviewsystemproductline.info.Contact;
import kernel.reviewsystemproductline.info.FAQ;
import kernel.reviewsystemproductline.info.InformationSystem;
import kernel.reviewsystemproductline.info.RestaurantInfo;
import kernel.reviewsystemproductline.model.Hotel;
import kernel.reviewsystemproductline.model.Movie;
import kernel.reviewsystemproductline.model.Restaurant;
import kernel.reviewsystemproductline.model.ReviewSystem;
import kernel.reviewsystemproductline.repository.HotelRepository;
import kernel.reviewsystemproductline.repository.MovieRepository;
import kernel.reviewsystemproductline.repository.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import kernel.reviewsystemproductline.Explore.Explore;

import java.util.stream.Stream;


@Component
public class ReviewSystemCommandLineRunner implements CommandLineRunner {

	private final HotelRepository hotelRepository;
	private final RestaurantRepository restaurantRepository;
	private final MovieRepository movieRepository;

	public ReviewSystemCommandLineRunner(HotelRepository hotelRepository, RestaurantRepository restaurantRepository, MovieRepository movieRepository) {
		this.hotelRepository = hotelRepository;
		this.restaurantRepository = restaurantRepository;
		this.movieRepository = movieRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		InformationSystem restaurantInfo = new Contact(new FAQ(new RestaurantInfo()));
		System.out.println(restaurantInfo.getInfo());

        SearchingSystem restaurantSearch = new SearchByFood(new SearchByLocation(new RestaurantSearch()));
        System.out.println(restaurantSearch.search());

		Explore exploreSys = new Explore("hotel");
        System.out.println(exploreSys);
        //exploreSys.getRecommendationSys().getRecommendationFactory()

		ReviewSystem revSys = new ReviewSystem("hotel");
		System.out.println(revSys.getRatingSystem());

*/
		//Explore exploreSys = new Explore();

		Stream.of("hotel 1", "hotel 2").forEach(name -> {
			Hotel hotel = new Hotel(name);
			hotelRepository.save(hotel);
		});

		Stream.of("movie 1", "movie 2").forEach(name -> {
			Movie movie = new Movie(name);
			movieRepository.save(movie);
		});

		Stream.of("restaurant 1", "restaurant 2").forEach(name -> {
			Restaurant restaurant = new Restaurant(name);
			restaurantRepository.save(restaurant);
		});
	}
}
