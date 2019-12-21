package kernel.reviewsystemproductline.info;

public class Contact extends InfoDecorator {

	private InformationSystem informationSystem;

	public Contact(InformationSystem informationSystem) {
		this.informationSystem = informationSystem;
	}

	@Override
	public InfoSystemDetails getInfo() {
		InfoSystemDetails currentInfo = informationSystem.getInfo();
		currentInfo.setHasContact(true);
		return currentInfo;
	}
}
