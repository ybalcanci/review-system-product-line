package kernel.reviewsystemproductline.model;

import javax.persistence.Entity;

@Entity
public class Restaurant extends ReviewedEntity {
	public Restaurant(String name) {
		super(name);
	}
}
