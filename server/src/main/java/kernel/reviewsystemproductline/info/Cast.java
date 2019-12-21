package kernel.reviewsystemproductline.info;

public class Cast extends InfoDecorator {
	private InformationSystem informationSystem;

	public Cast(InformationSystem informationSystem) {
		this.informationSystem = informationSystem;
	}

	@Override
	public InfoSystemDetails getInfo() {
		InfoSystemDetails currentInfo = informationSystem.getInfo();
		currentInfo.setHasCast(true);
		return currentInfo;
	}
}
