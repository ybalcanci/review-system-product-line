package kernel.reviewsystemproductline.model;

import javax.persistence.Entity;

@Entity
public class Movie extends ReviewedEntity {

	private String[] cast;
	private String[] crew;
	private String theme;
	private String trailer;

	public Movie() {
	}

	public Movie(String name) {
		super(name);
	}

	public Movie(String name, int age, String[] cast, String[] crew, String theme, String trailer) {
		super(name, age);
		this.cast = cast;
		this.crew = crew;
		this.theme = theme;
		this.trailer = trailer;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getCrew() {
		return crew;
	}

	public void setCrew(String[] crew) {
		this.crew = crew;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
}
