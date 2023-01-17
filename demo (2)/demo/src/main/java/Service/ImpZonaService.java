package Service;

import Entity.Zone;
import Interface.IZonaService;
import Repository.IZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpZonaService implements IZonaService {
    @Autowired
    IZonaRepository izonaRepository;

    @Override
    public List<Zone> getZona() {
        List <Zone> zone = izonaRepository.findAll();
        return zone;
    }

    @Override
    public void saveZona(Zone zone) {
        izonaRepository.save(zone);
    }

    @Override
    public void deleteZona(Integer id) {
        izonaRepository.deleteById(id);
    }

    @Override
    public Zone findZona(Long id) {
        return null;
    }

    @Override
    public Zone findZona(Integer id) {
        Zone zone = izonaRepository.findById(id).orElse(null);
        return zone;
    }
}
