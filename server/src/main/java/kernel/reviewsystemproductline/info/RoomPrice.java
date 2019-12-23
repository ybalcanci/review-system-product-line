package kernel.reviewsystemproductline.info;

public class RoomPrice extends InfoDecorator {
	private InformationSystem informationSystem;

	public RoomPrice(InformationSystem informationSystem) {
		this.informationSystem = informationSystem;
	}

	@Override
	public InfoSystemDetails getInfo() {
		InfoSystemDetails currentInfo = informationSystem.getInfo();
		currentInfo.setHasRoomPrice(true);
		return currentInfo;
	}
}
