package kernel.reviewsystemproductline.info;

public class RoomPrice extends InfoDecorator {
	private InformationSystem informationSystem;

	public RoomPrice(InformationSystem ınformationSystem) {
		this.informationSystem = ınformationSystem;
	}

	@Override
	public InfoSystemDetails getInfo() {
		InfoSystemDetails currentInfo = informationSystem.getInfo();
		currentInfo.setHasRoomPrice(true);
		return currentInfo;
	}
}
