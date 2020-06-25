package yu.bo.spring5cookbook.repositories;

import org.springframework.data.repository.CrudRepository;
import yu.bo.spring5cookbook.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}