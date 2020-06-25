package yu.bo.spring5cookbook.repositories;

import org.springframework.data.repository.CrudRepository;
import yu.bo.spring5cookbook.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
