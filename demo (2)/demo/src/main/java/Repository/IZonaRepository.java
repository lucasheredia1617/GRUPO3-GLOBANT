package Repository;

import Entity.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZonaRepository extends JpaRepository<Zona,Integer> {
}
