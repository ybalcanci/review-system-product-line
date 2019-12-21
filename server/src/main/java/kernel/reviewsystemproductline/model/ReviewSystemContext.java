package kernel.reviewsystemproductline.model;

import java.io.Serializable;

public class ReviewSystemContext implements Serializable {
	private boolean hasAgeLimit;
	private boolean hasRecommendationSystem;
	private boolean hasRateActor;
	private boolean hasRateDirector;
	private boolean hasUploadImageFeature;
	private boolean hasFAQ;
	private boolean hasCast;
	private boolean hasTrailer;
	private boolean hasRoomPrice;
	private boolean hasContact;
	private boolean hasSearchByLocation;
	private boolean hasSearchByCast;
	private boolean hasSearchByFood;
	private boolean hasRateParkingService;
	private boolean hasRateAndSeeHygiene;
	private boolean hasRateAndSeeDeliveryTime;
	private boolean hasRateWaiters;
	private boolean hasRateCastAndCrew;
	private boolean hasRestaurantRecommendation;
	private boolean hasTouristicRecommendation;
	private boolean hasThemeRecommendation;

	public ReviewSystemContext(boolean hasAgeLimit, boolean hasRecommendationSystem, boolean hasRateActor, boolean hasRateDirector, boolean hasUploadImageFeature, boolean hasFAQ, boolean hasCast, boolean hasTrailer, boolean hasRoomPrice, boolean hasContact, boolean hasSearchByLocation, boolean hasSearchByCast, boolean hasSearchByFood, boolean hasRateParkingService, boolean hasRateAndSeeHygiene, boolean hasRateAndSeeDeliveryTime, boolean hasRateWaiters, boolean hasRateCastAndCrew, boolean hasRestaurantRecommendation, boolean hasTouristicRecommendation, boolean hasThemeRecommendation) {
		this.hasAgeLimit = hasAgeLimit;
		this.hasRecommendationSystem = hasRecommendationSystem;
		this.hasRateActor = hasRateActor;
		this.hasRateDirector = hasRateDirector;
		this.hasUploadImageFeature = hasUploadImageFeature;
		this.hasFAQ = hasFAQ;
		this.hasCast = hasCast;
		this.hasTrailer = hasTrailer;
		this.hasRoomPrice = hasRoomPrice;
		this.hasContact = hasContact;
		this.hasSearchByLocation = hasSearchByLocation;
		this.hasSearchByCast = hasSearchByCast;
		this.hasSearchByFood = hasSearchByFood;
		this.hasRateParkingService = hasRateParkingService;
		this.hasRateAndSeeHygiene = hasRateAndSeeHygiene;
		this.hasRateAndSeeDeliveryTime = hasRateAndSeeDeliveryTime;
		this.hasRateWaiters = hasRateWaiters;
		this.hasRateCastAndCrew = hasRateCastAndCrew;
		this.hasRestaurantRecommendation = hasRestaurantRecommendation;
		this.hasTouristicRecommendation = hasTouristicRecommendation;
		this.hasThemeRecommendation = hasThemeRecommendation;
	}

	public boolean isHasAgeLimit() {
		return hasAgeLimit;
	}

	public boolean isHasRecommendationSystem() {
		return hasRecommendationSystem;
	}

	public boolean isHasRateActor() {
		return hasRateActor;
	}

	public boolean isHasRateDirector() {
		return hasRateDirector;
	}

	public boolean isHasUploadImageFeature() {
		return hasUploadImageFeature;
	}

	public boolean isHasFAQ() {
		return hasFAQ;
	}

	public boolean isHasCast() {
		return hasCast;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	public boolean isHasRoomPrice() {
		return hasRoomPrice;
	}

	public boolean isHasContact() {
		return hasContact;
	}

	public boolean isHasSearchByLocation() {
		return hasSearchByLocation;
	}

	public boolean isHasSearchByCast() {
		return hasSearchByCast;
	}

	public boolean isHasSearchByFood() {
		return hasSearchByFood;
	}

	public boolean isHasRateParkingService() {
		return hasRateParkingService;
	}

	public boolean isHasRateAndSeeHygiene() {
		return hasRateAndSeeHygiene;
	}

	public boolean isHasRateAndSeeDeliveryTime() {
		return hasRateAndSeeDeliveryTime;
	}

	public boolean isHasRateWaiters() {
		return hasRateWaiters;
	}

	public boolean isHasRateCastAndCrew() {
		return hasRateCastAndCrew;
	}

	public boolean isHasRestaurantRecommendation() {
		return hasRestaurantRecommendation;
	}

	public boolean isHasTouristicRecommendation() {
		return hasTouristicRecommendation;
	}

	public boolean isHasThemeRecommendation() {
		return hasThemeRecommendation;
	}
}
