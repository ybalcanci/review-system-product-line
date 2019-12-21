package kernel.reviewsystemproductline.model;

import javax.persistence.Entity;

@Entity
public class Restaurant extends ReviewedEntity {

	private String theme;
	private boolean isOpen;
	private double avgDeliveryTime;
	private double parkingServiceRating;

	public Restaurant() {
	}

	public Restaurant(String name) {
		super(name);
	}

	public Restaurant(String name, String theme, boolean isOpen, double avgDeliveryTime, double parkingServiceRating) {
		super(name);
		this.theme = theme;
		this.isOpen = isOpen;
		this.avgDeliveryTime = avgDeliveryTime;
		this.parkingServiceRating = parkingServiceRating;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean open) {
		isOpen = open;
	}

	public double getAvgDeliveryTime() {
		return avgDeliveryTime;
	}

	public void setAvgDeliveryTime(double avgDeliveryTime) {
		this.avgDeliveryTime = avgDeliveryTime;
	}

	public double getParkingServiceRating() {
		return parkingServiceRating;
	}

	public void setParkingServiceRating(double parkingServiceRating) {
		this.parkingServiceRating = parkingServiceRating;
	}
}
