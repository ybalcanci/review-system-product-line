package kernel.reviewsystemproductline.model;

import javax.persistence.Entity;

@Entity
public class Movie extends ReviewedEntity {
	public Movie(String name) {
		super(name);
	}
}
