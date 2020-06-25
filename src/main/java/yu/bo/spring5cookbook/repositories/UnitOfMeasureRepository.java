package yu.bo.spring5cookbook.repositories;

import org.springframework.data.repository.CrudRepository;
import yu.bo.spring5cookbook.model.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
