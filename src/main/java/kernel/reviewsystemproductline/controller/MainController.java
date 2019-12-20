package kernel.reviewsystemproductline.controller;

import kernel.reviewsystemproductline.model.Hotel;
import kernel.reviewsystemproductline.model.ReviewedEntity;
import kernel.reviewsystemproductline.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
public class MainController {

	@Autowired
	private HotelRepository hotelRepository;
/*
	@PostMapping
	public Hotel newMessage(@RequestBody Hotel message) {
		System.out.println("New Post Request: " + message);
		return hotelRepository.save(message);
	}
*/
	@GetMapping("/hotels")
	public List<Hotel> hotels() {
		List<Hotel> data = hotelRepository.findAll();
		System.out.println(data);
		return data;
	}
}
