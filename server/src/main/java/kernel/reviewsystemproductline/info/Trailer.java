package kernel.reviewsystemproductline.info;

public class Trailer extends InfoDecorator {
	private InformationSystem informationSystem;

	public Trailer(InformationSystem informationSystem) {
		this.informationSystem = informationSystem;
	}

	@Override
	public InfoSystemDetails getInfo() {
		InfoSystemDetails currentInfo = informationSystem.getInfo();
		currentInfo.setHasTrailer(true);
		return currentInfo;
	}
}
