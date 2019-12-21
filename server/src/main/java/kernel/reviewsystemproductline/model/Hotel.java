package kernel.reviewsystemproductline.model;

import javax.persistence.Entity;

@Entity
public class Hotel extends ReviewedEntity {

	private String place;
	private double hygieneRating;
	private double price;
	private String contactInfo;
	private double parkingServiceRating;

	public Hotel() {
	}

	public Hotel(String name) {
		super(name);
	}

	public Hotel(String name, String place, double hygieneRating, double price, String contactInfo, double parkingServiceRating) {
		super(name);
		this.place = place;
		this.hygieneRating = hygieneRating;
		this.price = price;
		this.contactInfo = contactInfo;
		this.parkingServiceRating = parkingServiceRating;
	}

	@Override
	public String toString() {
		return super.toString() +
				"Hotel{" +
				"place='" + place + '\'' +
				", hygieneRating=" + hygieneRating +
				", price=" + price +
				", contactInfo='" + contactInfo + '\'' +
				", parkingServiceRating=" + parkingServiceRating +
				'}';
	}
}
