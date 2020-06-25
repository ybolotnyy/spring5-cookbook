package yu.bo.spring5cookbook.repositories;

import org.springframework.data.repository.CrudRepository;
import yu.bo.spring5cookbook.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}