package kernel.reviewsystemproductline.info;

public class FAQ extends InfoDecorator {
	private InformationSystem informationSystem;

	public FAQ(InformationSystem informationSystem) {
		this.informationSystem = informationSystem;
	}

	@Override
	public InfoSystemDetails getInfo() {
		InfoSystemDetails currentInfo = informationSystem.getInfo();
		currentInfo.setHasFAQ(true);
		return currentInfo;
	}
}
