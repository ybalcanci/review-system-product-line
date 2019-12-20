package kernel.reviewsystemproductline;

import kernel.reviewsystemproductline.model.Hotel;
import kernel.reviewsystemproductline.repository.HotelRepository;
import kernel.reviewsystemproductline.repository.MovieRepository;
import kernel.reviewsystemproductline.repository.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
		Stream.of("hotel 1", "hotel 2").forEach(name -> {
			Hotel hotel = new Hotel(name);
			hotelRepository.save(hotel);
		});
	}
}
