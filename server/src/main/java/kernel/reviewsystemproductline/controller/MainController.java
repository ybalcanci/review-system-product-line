package kernel.reviewsystemproductline.controller;

import kernel.reviewsystemproductline.model.Hotel;
import kernel.reviewsystemproductline.model.Movie;
import kernel.reviewsystemproductline.model.Restaurant;
import kernel.reviewsystemproductline.repository.HotelRepository;
import kernel.reviewsystemproductline.repository.MovieRepository;
import kernel.reviewsystemproductline.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
public class MainController {

	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private RestaurantRepository restaurantRepository;

/*
	@PostMapping("/hotels")
	public Hotel newHotel(@RequestBody Hotel hotel) {
		System.out.println("New Post Request: " + hotel);
		return hotelRepository.save(hotel);
	}
*/
	@GetMapping("/hotels")
	public List<Hotel> hotels() {
		List<Hotel> data = hotelRepository.findAll();
		System.out.println(data);
		return data;
	}

	@GetMapping("/movies")
	public List<Movie> movies() {
		List<Movie> data = movieRepository.findAll();
		System.out.println(data);
		return data;
	}

	@GetMapping("/restaurants")
	public List<Restaurant> restaurants() {
		List<Restaurant> data = restaurantRepository.findAll();
		System.out.println(data);
		return data;
	}
}
