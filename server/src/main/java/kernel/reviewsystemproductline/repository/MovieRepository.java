package kernel.reviewsystemproductline.repository;

import kernel.reviewsystemproductline.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
