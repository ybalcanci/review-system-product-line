package kernel.reviewsystemproductline.info;

public abstract class InformationSystem {
	private InfoSystemDetails infoSystemDetails;

	protected InformationSystem() {
		this.infoSystemDetails = new InfoSystemDetails();
	}

	public InfoSystemDetails getInfo(){
		return infoSystemDetails;
	}
}
