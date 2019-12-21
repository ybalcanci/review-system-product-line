package kernel.reviewsystemproductline.info;

public class InfoSystemDetails{
		private boolean hasFAQ;
		private boolean hasCast;
		private boolean hasTrailer;
		private boolean hasRoomPrice;
		private boolean hasContact;

		public InfoSystemDetails() {
			this.hasFAQ = false;
			this.hasCast = false;
			this.hasTrailer = false;
			this.hasRoomPrice = false;
			this.hasContact = false;
		}

		public boolean isHasFAQ() {
			return hasFAQ;
		}

		public void setHasFAQ(boolean hasFAQ) {
			this.hasFAQ = hasFAQ;
		}

		public boolean isHasCast() {
			return hasCast;
		}

		public void setHasCast(boolean hasCast) {
			this.hasCast = hasCast;
		}

		public boolean isHasTrailer() {
			return hasTrailer;
		}

		public void setHasTrailer(boolean hasTrailer) {
			this.hasTrailer = hasTrailer;
		}

		public boolean isHasRoomPrice() {
			return hasRoomPrice;
		}

		public void setHasRoomPrice(boolean hasRoomPrice) {
			this.hasRoomPrice = hasRoomPrice;
		}

		public boolean isHasContact() {
			return hasContact;
		}

		public void setHasContact(boolean hasContact) {
			this.hasContact = hasContact;
		}

	@Override
	public String toString() {
		return "InfoSystemDetails{" +
				"hasFAQ=" + hasFAQ +
				", hasCast=" + hasCast +
				", hasTrailer=" + hasTrailer +
				", hasRoomPrice=" + hasRoomPrice +
				", hasContact=" + hasContact +
				'}';
	}
}
