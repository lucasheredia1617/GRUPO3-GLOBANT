package Repository;

import Entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZonaRepository extends JpaRepository<Zone,Integer> {
}
