package kernel.reviewsystemproductline.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ReviewedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idgen")
	protected long id;

	protected String name;
	protected int age;
	protected double overallRating;

	protected ReviewedEntity() {
	}

	protected ReviewedEntity(String name) {
		this.name = name;
		this.age = 0;
		this.overallRating = 0;
	}

	protected ReviewedEntity(String name, int age) {
		this.name = name;
		this.age = age;
		this.overallRating = 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(double overallRating) {
		this.overallRating = overallRating;
	}

	@Override
	public String toString() {
		return "ReviewedEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", overallRating=" + overallRating +
				'}';
	}
}
