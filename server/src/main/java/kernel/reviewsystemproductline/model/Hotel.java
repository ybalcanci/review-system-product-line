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
