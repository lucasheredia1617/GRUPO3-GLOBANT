package Repository;

import Entity.Supervisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SupRepository extends CrudRepository<Supervisor, Long>{

}
